package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;
    protected int matricula;

    public Funcionario(String nome, double salario, int matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo ////");
    }
}
