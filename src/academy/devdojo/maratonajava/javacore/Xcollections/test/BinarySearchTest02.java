package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(9);
        numeros.add(4);
        numeros.add(0);
        numeros.add(1);
        numeros.add(5);

        //  (-(ponto de inserção) -1)
        // index 0,1,2,3,4
        // value 9,4,0,1,5

        Collections.sort(numeros); // ordena a lista
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("#################################");
        System.out.println(Collections.binarySearch(numeros, 0)); // pega a lista ordenada e verifica se o elemento está na lista
        System.out.println(Collections.binarySearch(numeros, -1));
        System.out.println(Collections.binarySearch(numeros, 7)); // o 7 não está na lista. Ele retorna no lugar de qual elemento o 7 deveria estar inserido para manter a ordem da lista, vezes -1.

    }
}
