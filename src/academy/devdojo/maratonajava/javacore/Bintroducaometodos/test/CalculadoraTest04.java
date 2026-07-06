package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = 29;
        int numero2 = 64;
        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1 = "+ numero1);
        System.out.println("Num2 = "+ numero2);
    }
}
