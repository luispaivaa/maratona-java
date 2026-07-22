package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.1;
    }

}
