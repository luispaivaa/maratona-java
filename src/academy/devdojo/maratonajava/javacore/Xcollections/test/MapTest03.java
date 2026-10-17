package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Luis Henrique");
        Consumidor consumidor2 = new Consumidor("Zé Bedeu");

       Filme filme1 = new Filme(1L,"Guerra Mundial Z", 20.99, 0);
       Filme filme2 = new Filme(4L,"Nada de Novo no Front", 15.8, 5);
       Filme filme3 = new Filme(3L,"O Incrível Hulk", 10.19, 9);
       Filme filme4 = new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2);
       Filme filme5 = new Filme(2L,"Homem de Ferro 1", 22.99,0);
       Filme filme6 = new Filme(2L,"Até o último homem", 5.99,0);


       List<Filme> consumidor1ListFilmes = List.of(filme1, filme2, filme3);
       List<Filme> consumidor2ListFilmes = List.of(filme4, filme5, filme6);
       Map<Consumidor, List<Filme>> consumidorFilme = new HashMap<>();
       consumidorFilme.put(consumidor1, consumidor1ListFilmes);
       consumidorFilme.put(consumidor2, consumidor2ListFilmes);

        for (Map.Entry<Consumidor, List<Filme>> entry : consumidorFilme.entrySet()) {
            System.out.println(entry.getKey().getNome());
            // System.out.println(entry.getValue()); - vai exibir a lista inteira. Nesse caso, precisamos criar outro foreach para imprimir a lista de Filmes.
            for (Filme filme : entry.getValue()) {
                System.out.println(filme.getTitulo());
            }

        }

    }
}
