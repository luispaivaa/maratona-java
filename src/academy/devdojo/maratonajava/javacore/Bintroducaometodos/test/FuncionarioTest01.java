package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setIdade(30);
        funcionario01.setNome("Luis Henrique Paiva");
        funcionario01.setSalarios(new double[] {1000, 200, 444});

        funcionario01.imprimeDados();
        funcionario01.imprimeMediaSalarial();

        System.out.println("-----------------");
        System.out.println("Testando métoddo GET: ");
        System.out.println(funcionario01.getIdade());
        System.out.println(funcionario01.getNome());
        System.out.println(funcionario01.getSalarios());
        System.out.println(funcionario01.getMedia());

    }
}
