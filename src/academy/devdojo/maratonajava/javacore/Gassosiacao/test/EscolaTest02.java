package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Professor;

public class EscolaTest02 {
    public static void main(String[] args) {
        Escola escola = new Escola("CEST");
        Professor professor1 = new Professor("Edgard");
        Professor[] professors = {professor1};
        escola.setProfessores(professors);


        escola.imprime();
    }
}
