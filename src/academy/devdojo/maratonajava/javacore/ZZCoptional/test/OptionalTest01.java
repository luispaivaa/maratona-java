package academy.devdojo.maratonajava.javacore.ZZCoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Teste teste teste");
        Optional<String> o2 = Optional.ofNullable(null); // .ofNullable pode retornar null
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o1.get());
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("---------------");

        Optional<String> optionalName = findName("luis");
        String empty = optionalName.orElse("EMPTY");
        System.out.println(empty);
        optionalName.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Luis", "Henrique");
        int i = list.indexOf(name);
        if (i != 1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
