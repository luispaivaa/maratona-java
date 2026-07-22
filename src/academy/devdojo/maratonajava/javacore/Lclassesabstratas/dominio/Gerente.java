package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.2;
    }

}
