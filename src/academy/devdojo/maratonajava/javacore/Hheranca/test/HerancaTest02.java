package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

import java.util.Scanner;

public class HerancaTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Endereco enderecoPessoa = new Endereco();
        System.out.println("Informe o seu CEP: ");
        String cep = input.nextLine();
        enderecoPessoa.setCep(cep);
        System.out.println("Informe o nome da rua: ");
        String nomdeDaRua = input.nextLine();
        enderecoPessoa.setNomeDaRua(nomdeDaRua);


        System.out.println("---CADASTRO PESSOA---");
        System.out.println("Digite seu nome completo: ");
        String nomePessoa = input.nextLine();
        Pessoa pessoa = new Pessoa(nomePessoa);
        System.out.println("Informe seu CPF: ");
        pessoa.setCpf(input.nextLine());
        pessoa.setEndereco(enderecoPessoa);
        System.out.println("-----------------------");

        System.out.println("--> DADOS PESSOA");
        pessoa.imprime();

    }
}
