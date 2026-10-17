package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Consumidor, Filme> consumidorFilmeMap = new LinkedHashMap<>(); // LinkedHashMap preserva ordem de inserção
        Consumidor consumidor1 = new Consumidor("Luis Henrique");
        Consumidor consumidor2 = new Consumidor("Zé Bedeu");

       Filme filme1 = new Filme(1L,"Guerra Mundial Z", 20.99, 0);
       Filme filme2 = new Filme(4L,"Nada de Novo no Front", 15.8, 5);
       Filme filme3 = new Filme(3L,"O Incrível Hulk", 10.19, 9);
       Filme filme4 = new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2);
       Filme filme5 = new Filme(2L,"Homem de Ferro 1", 22.99,0);
       Filme filme6 = new Filme(2L,"Até o último homem", 5.99,0);

       consumidorFilmeMap.put(consumidor1, filme3);
       consumidorFilmeMap.put(consumidor2, filme5);
        System.out.println(consumidorFilmeMap);

    }
}
