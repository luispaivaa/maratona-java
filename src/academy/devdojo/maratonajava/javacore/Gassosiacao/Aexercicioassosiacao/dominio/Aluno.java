package academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminarioAgendado;


    public Aluno(String nome, int idade, Seminario seminarioAgendado) {
        this.nome = nome;
        this.idade = idade;
        this.seminarioAgendado = seminarioAgendado;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminarioAgendado() {
        return seminarioAgendado;
    }

    public void setSeminarioAgendado(Seminario seminarioAgendado) {
        this.seminarioAgendado = seminarioAgendado;
    }
}
