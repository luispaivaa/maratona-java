package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import academy.devdojo.maratonajava.javacore.ZZDstreams.domain.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {
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
            List<String> titles = booksList.stream()
                    .sorted(Comparator.comparing(Books::getTitle)) //ordena por titulo
                    .filter(b -> b.getPrice() <= 20) // filtra livros até 20 reais
                    .limit(3) // maximo de tres livros (ou tres primeiros livros da lista com esse preco)
                    .map(Books::getTitle) // pega apenas os titulos dos livros
                    .collect(Collectors.toList()); // transforma em uma lista

        System.out.println(titles);
    }
}
