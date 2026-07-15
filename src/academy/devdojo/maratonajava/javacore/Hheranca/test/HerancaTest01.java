package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco enderecoPessoa = new Endereco();
        enderecoPessoa.setCep("58400-942");
        enderecoPessoa.setNomeDaRua("Rua das Laranjeiras");

        Endereco enderecoFuncionario = new Endereco();
        enderecoFuncionario.setNomeDaRua("Rua do Rio");
        enderecoFuncionario.setCep("987654321-00");

        Pessoa pessoa = new Pessoa("Luis");
        pessoa.setCpf("123456999-00");
        pessoa.setEndereco(enderecoPessoa);

        Funcionario funcionario = new Funcionario("Fulano");
        funcionario.setSalario(2500.00);
        funcionario.setCpf("123456789-00");
        funcionario.setEndereco(enderecoFuncionario);

        System.out.println("--> DADOS PESSOA");
        pessoa.imprime();
        System.out.println("-----------------------------------------------");
        System.out.println("--> DADOS FUNCIONÁRIO");
        funcionario.imprime();

    }
}
