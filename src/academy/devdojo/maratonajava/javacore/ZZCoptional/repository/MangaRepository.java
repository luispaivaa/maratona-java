package academy.devdojo.maratonajava.javacore.ZZCoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZCoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangaList = List.of(new Manga(1, "Naruto", 400), new Manga(2, "Dragon Ball Z", 340));

    public static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangaList) {
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitle(String title){
       return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }
}
