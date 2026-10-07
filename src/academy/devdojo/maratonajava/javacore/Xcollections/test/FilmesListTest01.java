package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilmesListTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        System.out.println("----------------------");
        Collections.sort(filmes);
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
