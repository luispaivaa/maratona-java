package academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminariosAgendados;


    public void dadosProfessor(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminários Agendados: ");
        if (this.seminariosAgendados == null || this.seminariosAgendados.length == 0){
            System.out.println("Nenhum seminário agendado.");
        } else{
            for (Seminario seminarioAgendado : seminariosAgendados) {
                System.out.println("- " + seminarioAgendado.getTituloDoSeminario() + " | Local: " + seminarioAgendado.getLocalDoSeminario().getEnderecoDoSeminario());
            }

        }
    }

    public Professor(String nome, String especialidade, Seminario[] seminariosAgendados) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminariosAgendados = seminariosAgendados;
    }

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(Seminario[] seminariosAgendados) {
        this.seminariosAgendados = seminariosAgendados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminariosAgendados() {
        return seminariosAgendados;
    }

    public void setSeminariosAgendados(Seminario[] seminariosAgendados) {
        this.seminariosAgendados = seminariosAgendados;

    }
}
