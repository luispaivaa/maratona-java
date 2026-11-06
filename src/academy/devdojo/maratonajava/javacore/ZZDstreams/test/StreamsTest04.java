package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> csc = new ArrayList<>();
        List<String> cadastro = List.of("Luis", "Dani", "Mano", "Edu");
        List<String> financeiro = List.of("Pedro", "Régis", "Rosalba");
        List<String> rh = List.of("Ana", "Marcelo", "Amanda");
        csc.add(cadastro);
        csc.add(financeiro);
        csc.add(rh);

        for (List<String> people : csc) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("#########################"); // ou

        csc.stream()
                .flatMap(Collection::stream) // ideal para acessar atributos em listas aninhadas. O flatMap comprime a lista em uma só
                .forEach(System.out::println);

    }
}
