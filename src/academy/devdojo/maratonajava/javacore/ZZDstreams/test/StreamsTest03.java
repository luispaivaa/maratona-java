package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import academy.devdojo.maratonajava.javacore.ZZDstreams.domain.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<Books> booksList = new ArrayList<>(List.of(
            new Books("Dom Casmurro", 40.00),
            new Books("Entendendo ALgoritmos", 23.50),
            new Books("Admirável Mundo Novo", 32.99),
            new Books("Angústia", 12.99),
            new Books("Vidas Secas", 18.00),
            new Books("O Hobbit", 14.50),
            new Books("Livro do Desassosego", 19.99),
            new Books("O caçador de pipas", 10.00)
    ));
    public static void main(String[] args) {
        Stream<Books> booksStream = booksList.stream();
        booksList.forEach(System.out::println);

        long count = booksStream
                .distinct()
                .filter(books -> books.getPrice() <= 20)
                .count();
        System.out.println(count);
    }
}
