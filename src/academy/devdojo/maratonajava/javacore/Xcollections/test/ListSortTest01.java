package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();
        filmes.add("Uma Noite no Museu");
        filmes.add("Platoon");
        filmes.add("Homem-Aranha");
        filmes.add("Ilha do Medo");

        System.out.println("Lista desordenada: ");
        System.out.println(filmes);

        Collections.sort(filmes); //ordena a lista em ordem alfabética
        System.out.println("Lista ordenada: ");
        System.out.println(filmes);

        System.out.println("###############################");

        List<Double> precos = new ArrayList<>();
        precos.add(1000.3);
        precos.add(350.5);
        precos.add(443D);
        precos.add(16087.4);

        System.out.println("Lista desordenada: ");
        System.out.println(precos);

        Collections.sort(precos); //oredena valores double em ordem crescente
        System.out.println("Lista ordenada:");
        System.out.println(precos);
    }
}
