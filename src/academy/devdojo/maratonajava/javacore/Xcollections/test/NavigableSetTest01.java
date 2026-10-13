package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;
import academy.devdojo.maratonajava.javacore.Xcollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
            NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
            Smartphone smartphone = new Smartphone("1234G0", "Xiaomi");
            set.add(smartphone);
            System.out.println(set);

            NavigableSet<Filme> filmes = new TreeSet<>();
            filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99, 0));
            filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8, 5));
            filmes.add(new Filme(3L,"O Incrível Hulk", 10.19, 0));
            filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2));
            filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99,0));


        System.out.println("--------------------------");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }


    }
}
