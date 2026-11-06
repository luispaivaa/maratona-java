package academy.devdojo.maratonajava.javacore.ZZDstreams.test;

import academy.devdojo.maratonajava.javacore.ZZDstreams.domain.Business;
import academy.devdojo.maratonajava.javacore.ZZDstreams.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Business> businesses = new ArrayList<>();
        businesses.add(
                new Business("Facebook", new ArrayList<Person>() {{
                    add(new Person("Luis", 21));
                    add(new Person("Sara", 34));
                    add(new Person("Emilly", 26));
                }}));
        businesses.add(
                new Business("TikTok", new ArrayList<Person>(){{
                    add(new Person("Zach", 29));
                    add(new Person("Lee Park Sun", 24));
                }}));
        businesses.add(
                new Business("Google", new ArrayList<Person>(){{
                    add(new Person("Brad", 37));
                    add(new Person("Roger", 31));
                    add(new Person("Ritchie P.", 26));
                }}));
        businesses.add(
                new Business("OpenAI", new ArrayList<Person>(){{
                    add(new Person("Adam Sandler", 59));
                    add(new Person("Sam Altman", 18));
                    add(new Person("Ronald Junior", 22));
                }}));

        businesses
                .stream()
                .map(Business::getName)
                .forEach(System.out::println); // imprime nomes das empresas
        System.out.println("------------------");
        businesses
                .stream() // gera uma stream de Business
                .flatMap(b -> b.getEmployees().stream()) //gera stream de person
                .sorted()  //stream de person
                .map(Person::getName) // stream String
                .forEach(System.out::println); // void
        System.out.println("------------------");
        businesses
                .stream()
                .filter(b -> b.getName().startsWith("G"))
                .flatMap(b -> b.getEmployees().stream())
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
