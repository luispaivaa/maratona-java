package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Luis Henrique";
        funcionario01.idade = 20;
        funcionario01.salarios = new double[] {800, 986};

        funcionario01.imprimeDados();
        funcionario01.imprimeMediaSalarial();
    }
}
