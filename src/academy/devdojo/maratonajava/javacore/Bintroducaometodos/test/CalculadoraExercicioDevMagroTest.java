package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.CalculadoraExercicioDevMagro;

import java.util.Arrays;

public class CalculadoraExercicioDevMagroTest {
    public static void main(String[] args) {
        CalculadoraExercicioDevMagro calculadora = new CalculadoraExercicioDevMagro();

        System.out.println("Teste do método 'verificaNumeroPrimo()'");
        boolean result = calculadora.verificaNumeroPrimo(4);
        System.out.println(result);

        System.out.println("Testando método 'multiplicaListaPorDois()'");
        int[] resultado = calculadora.multiplicaListaPorDois(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(resultado));

        System.out.println("Testando método 'identificaNumerosPares()'");
        int[] arrayPar = calculadora.identificaNumerosPares(new int[] {1,33,45,56,78,80,12,8,7,4,2,11,255});
        System.out.println(Arrays.toString(arrayPar));
    }
}
