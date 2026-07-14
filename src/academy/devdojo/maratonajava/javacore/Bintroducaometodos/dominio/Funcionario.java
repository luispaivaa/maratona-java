package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarios=" + Arrays.toString(salarios) +
                '}';
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

    public String getSalarios() {
        return Arrays.toString(this.salarios);
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
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
        if(salarios.length <= 2){
            System.out.println("Informe pelo menos 3 salários!");
            return;
        }

        double soma = 0;
        for (double salario : this.salarios){
            soma += salario;
        }
         this.media = soma / this.salarios.length;

        System.out.println("----------------------");
        System.out.println("A média salarial de " + this.nome + " é: R$ " + media);
    }
}