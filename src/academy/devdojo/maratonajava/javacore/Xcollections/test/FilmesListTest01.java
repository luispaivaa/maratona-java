package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilmesListTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1,"Guerra Mundial Z", 20.99));
        filmes.add(new Filme(4,"Nada de Novo no Front", 15.8));
        filmes.add(new Filme(3,"O Incrível Hulk", 10.19));
        filmes.add(new Filme(7,"Os Vingadores: Ultimato", 24.99));
        filmes.add(new Filme(2,"Homem de Ferro 1", 22.99));

        Collections.sort(filmes);
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
