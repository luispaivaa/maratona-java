package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Filme> filmes = new LinkedHashSet<>(); // MANTÊM ordem de insercao
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99, 0));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8, 5));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19, 0));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99,0));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        filmes.add(new Filme(8L,"Platoon", 3.99,2));
        filmes.add(new Filme(8L,"Platoon", 3.99,2)); // não permite adcionar elementos duplicados
        System.out.println("--------------------------");

        for (Filme filme : filmes) {
            System.out.println(filme);
        }


    }
}
