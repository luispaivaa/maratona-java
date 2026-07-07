package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Luis";
        estudante01.idade = 21;
        estudante01.sexo = 'M';


        estudante02.nome = "Emilly";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        System.out.println("Estudante 01: ");
        impressora.imprime(estudante01);

        System.out.println("-------------------");

        System.out.println("Estudante 02: ");
        impressora.imprime(estudante02);
    }
}
