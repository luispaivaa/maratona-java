package academy.devdojo.maratonajava.javacore.ZZBlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Manga", "Maça", "Café", "Lápis");
        List<Integer> stringsLength = map(strings, s -> s.length());
        List<String> stringsUpper = map(strings, s -> s.toUpperCase());
        System.out.println(stringsLength);
        System.out.println(stringsUpper);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
