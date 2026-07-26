package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class CalculoImpostoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook M4 Pro", 10000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Produto tv = new Televisao("Samsung Oled 4k 50\" ", 5500);

        // OU
        // Televisao tv = new Televisao("Samsung Oled 4k 50\" ", 5500);

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tv);
    }
}
