package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Luis Henrique");
        pessoa.setIdade(21);
        System.out.println("Imprimindo dados utilizando SET");
        pessoa.imprime();

        System.out.println("----------------");
        System.out.println("Imprimindo dados utilizando GET");
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
