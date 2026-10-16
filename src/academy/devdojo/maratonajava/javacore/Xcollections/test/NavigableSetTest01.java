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

class FilmePrecoComparator implements Comparator<Filme>{
    public int compare(Filme o1, Filme o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
            NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
            Smartphone smartphone = new Smartphone("1234G0", "Xiaomi");
            set.add(smartphone);
            System.out.println(set);

            NavigableSet<Filme> filmes = new TreeSet<>(new FilmePrecoComparator());
            filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99, 0));
            filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8, 5));
            filmes.add(new Filme(3L,"O Incrível Hulk", 10.19, 0));
            filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2));
            filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99,0));


        System.out.println("--------------------------");
        for (Filme filme : filmes.descendingSet()) {
            System.out.println(filme);
        }

        System.out.println("###########################");
        Filme autoDaCompadecida = new Filme(13L, "O Auto da Compadecida", 53.00, 9);
        System.out.println(filmes.lower(autoDaCompadecida));
        System.out.println(filmes.ceiling(autoDaCompadecida));
        System.out.println(filmes.floor(autoDaCompadecida));
        System.out.println(filmes.size());
        System.out.println(filmes.pollFirst());
        System.out.println(filmes.size());

    }
}
