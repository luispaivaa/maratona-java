package academy.devdojo.maratonajava.javacore.ZZBlambdas.test;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferencesTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparator = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Naruto", 400), new Anime("Digimon", 120)));

        animeList.sort(animeComparator::compareByEpsodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, epsodes) -> new Anime(title, epsodes);
        //ou
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new; // ainda não cria o objeto
        System.out.println(animeBiFunction2.apply("Dragon Ball GT", 240)); //aqui o objeto é criado, através do .apply()

    }
}
