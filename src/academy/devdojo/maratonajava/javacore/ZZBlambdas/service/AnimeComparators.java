package academy.devdojo.maratonajava.javacore.ZZBlambdas.service;

import academy.devdojo.maratonajava.javacore.ZZBlambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
        public static int compareByEpsodes(Anime a1, Anime a2){
        return Integer.compare(a1.getEpsodes(), a2.getEpsodes());
    }
}
