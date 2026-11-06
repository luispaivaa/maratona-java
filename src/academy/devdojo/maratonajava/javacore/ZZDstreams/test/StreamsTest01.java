package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import academy.devdojo.maratonajava.javacore.ZZDstreams.domain.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
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
        booksList.sort(Comparator.comparing(Books::getTitle));
        List<String> titles = new ArrayList<>();
        for (Books book : booksList) {
            if (book.getPrice() < 20){
                titles.add(book.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(booksList);
        System.out.println(titles);
    }
}
