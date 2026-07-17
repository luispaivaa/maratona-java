package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização ESTÁTICO da SubClasse(Funcionário).");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 da SubClasse(Funcionário).");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 da SubClasse(Funcionário).");

    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor da SubClasse(Funcionário).");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
