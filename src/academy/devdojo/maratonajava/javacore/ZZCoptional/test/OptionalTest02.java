package academy.devdojo.maratonajava.javacore.ZZCoptional.test;

import academy.devdojo.maratonajava.javacore.ZZCoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZCoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto");
        System.out.println(mangaByTitle);
        mangaByTitle.ifPresent(m -> m.setTitle("Naruto Shippuden")); // se o mangar estiver presente, troca o título
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new); // se nao encontrar ele lança IllegalArgumentException
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Pokemon").orElse(new Manga(3, "Pokemon", 220)); // se não encontrar o manga ele adciona na lista
        System.out.println(newManga);

    }
}
