package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class CalculoImpostoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Lenovo Yoga Slim I7", 7000);
        Produto produto2 = new Tomate("Tomate Americano", 15);

        Tomate tomate = new Tomate("Tomate Árabe", 14);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);

    }
}
