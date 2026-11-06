package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest07 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(List.of("Banana", "Maçã", "Manga"));
        frutas.stream()
                .forEach(System.out::println);
        // para cada iteração na lista, passe o elemento como parâmetro do System.out.println(elemento da lista)
    }
}
