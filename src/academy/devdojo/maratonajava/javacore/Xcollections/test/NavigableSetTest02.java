package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest02 {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("A");
        System.out.println("Navigable Set -> " + set);

        String d = "D";
        System.out.println("D exists in NavigableSet ? " + set.contains(d));
        System.out.println("First element of NavigableSet -> " + set.first());
        System.out.println("Last element of NavigableSet -> " + set.last());
        System.out.println("Lower(C) -> " + set.lower("C"));

    }
}
