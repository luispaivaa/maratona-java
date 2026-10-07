package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmesByIdComparator implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        return filme1.getId().compareTo(filme2.getId());
    }
}

public class FilmesSortTest02 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99));

        System.out.println("Lista desordenada: ");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("------------------------");

        Collections.sort(filmes); //ordena a lista em ordem alfabética
        System.out.println("Lista ordenada por título: ");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("------------------------");


    //    Collections.sort(filmes, new FilmesByIdComparator()); //ordena a lista por ID
        filmes.sort(new FilmesByIdComparator());
        System.out.println("Lista ordenada por ID: ");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
