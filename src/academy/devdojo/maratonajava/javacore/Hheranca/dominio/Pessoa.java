package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização ESTÁTICO da SuperClasse(Pessoa).");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 da SuperClasse(Pessoa).");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 da SuperClasse(Pessoa).");
    }
    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor da SubClasse(Funcionário).");
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getNomeDaRua() + " | CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
