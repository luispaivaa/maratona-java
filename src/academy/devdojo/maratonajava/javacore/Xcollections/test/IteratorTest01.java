package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99, 0));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8, 5));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19, 0));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99,0));

        // NÃO FUNCIONA
//        for (Filme filme : filmes) {
//            if (filme.getQuantidade() == 0){
//                filmes.remove(filme);
//            }
//        }

        // FUNCIONA
//        Iterator<Filme> filmeIterator = filmes.iterator();
//        while (filmeIterator.hasNext()){
//            Filme nextFilme = filmeIterator.next();
//            if (nextFilme.getQuantidade() == 0){
//                filmeIterator.remove();
//            }
//        }

        System.out.println(filmes);

        // PROGRAMAÇÃO FUNCIONAL
        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println("-------------------------------------");
        System.out.println(filmes);

    }
}
