package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        FilmesByIdComparator filmesByIdComparator = new FilmesByIdComparator();
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99));

//        Collections.sort(filmes);
        filmes.sort(filmesByIdComparator);
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        //para a busca binária a lista deve estar ordenada, obrigatoriamente
        Filme movieToSearch = new Filme(3L, "O Incrível Hulk", 10.19);
        System.out.println(Collections.binarySearch(filmes, movieToSearch, filmesByIdComparator));

    }
}
