package academy.devdojo.maratonajava.javacore.ZZBlambdas.test;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Naruto", 400), new Anime("Digimon", 120)));
        animeList.sort(animeComparators::compareByEpsodesNonStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByEpsodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
