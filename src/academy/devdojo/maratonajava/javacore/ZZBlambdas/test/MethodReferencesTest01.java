package academy.devdojo.maratonajava.javacore.ZZBlambdas.test;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferencesTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Naruto", 400), new Anime("Digimon", 120)));
//        animeList.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, (a1,a2) -> AnimeComparators.compareByTitle(a1,a2)); // - criando um classe que faz a mesma função do Comparator
        animeList.sort(AnimeComparators::compareByTitle); // Referencia ao metodo. Sintaxe simplificada. Faz a mesma coisa da linha de cima
        animeList.sort(AnimeComparators::compareByEpsodes);
        System.out.println(animeList);
    }
}
