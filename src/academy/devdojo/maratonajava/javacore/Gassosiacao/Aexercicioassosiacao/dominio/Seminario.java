package academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio;

public class Seminario {
    private String tituloDoSeminario;
    private Local localDoSeminario;
    private Professor professorMinistrante;
    private Aluno[] alunos;


    public Seminario(String tituloDoSeminario, Local localDoSeminario, Professor professorMinistrante, Aluno[] alunos) {
        this.tituloDoSeminario = tituloDoSeminario;
        this.localDoSeminario = localDoSeminario;
        this.professorMinistrante = professorMinistrante;
        this.alunos = alunos;
    }


    public Seminario(String tituloDoSeminario, Local localDoSeminario, Aluno[] alunos) {
        this.tituloDoSeminario = tituloDoSeminario;
        this.localDoSeminario = localDoSeminario;
        this.alunos = alunos;
    }


    public Seminario(String tituloDoSeminario) {
        this.tituloDoSeminario = tituloDoSeminario;
    }

    public Seminario(Local localDoSeminario) {
        this.localDoSeminario = localDoSeminario;
    }

    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("Título: " + this.getTituloDoSeminario());
        System.out.println("Professor (Ministrante): " + this.professorMinistrante.getNome() + " | Especialidade: " + this.professorMinistrante.getEspecialidade());
        System.out.println("Local: " + (this.localDoSeminario == null ? "Local não definido." : this.localDoSeminario.getEnderecoDoSeminario()));
        System.out.println("Relação de Alunos: ");
        if (this.alunos == null || this.alunos.length == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else{
            for (Aluno aluno : this.alunos) {
                System.out.println("- " + aluno.getNome() + " | Idade: " + aluno.getIdade());
            }

        }
    }


    public Professor getProfessorMinistrante() {
        return professorMinistrante;
    }

    public void setProfessorMinistrante(Professor professorMinistrante) {
        this.professorMinistrante = professorMinistrante;


    }

    public String getTituloDoSeminario() {
        return tituloDoSeminario;
    }

    public void setTituloDoSeminario(String tituloDoSeminario) {
        this.tituloDoSeminario = tituloDoSeminario;
    }

    public Local getLocalDoSeminario() {
        return localDoSeminario;
    }

    public void setLocalDoSeminario(Local localDoSeminario) {
        this.localDoSeminario = localDoSeminario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;

        if(alunos != null){
        for (Aluno aluno : alunos) {
            aluno.setSeminarioAgendado(this);
        }
        }
    }

}
