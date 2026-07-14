package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Professor;


public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Tia Rita");
        Professor professor2 = new Professor("Tia Fabiana");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola Lápis na Mão", professores);

        escola.imprime();
    }
}
