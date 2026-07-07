package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarios=" + Arrays.toString(salarios) +
                '}';
    }

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if(salarios.length <= 2 || salarios == null){
            System.out.println("Informe pelo menos 3 salários!");
            return;
        }

        System.out.println("Salários: ");
        for (double salario : salarios){
            System.out.println("R$ " + salario + " ");
        }

        System.out.println("----------------------");
    }

    public void imprimeMediaSalarial(){
        if(salarios.length <= 2 || salarios == null){
            System.out.println("Informe pelo menos 3 salários!");
            return;
        }

        double soma = 0;
        for (double salario : this.salarios){
            soma += salario;
        }
        double media = soma / this.salarios.length;

        System.out.println("----------------------");
        System.out.println("A média salarial de " + this.nome + " é: R$ " + media);
    }
}