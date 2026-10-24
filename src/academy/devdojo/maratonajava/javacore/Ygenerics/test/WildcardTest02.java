package academy.devdojo.maratonajava.javacore.Ygenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(gatos);
        printConsulta(cachorros);

        System.out.println("----------------------------------");

        List<Animal> animals = new ArrayList<>() ;
        printConsultaAnimal(animals); // adciona animal na lista
        printConsulta(animals);
    }
    private static void printConsulta(List<? extends Animal> animals){ // aceita qualquer classe que extenda (que seja filho) Animal
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals.add(new Cachorro()); não pode adcionar mais itens
        // tudo apenas para leitura
        // List<? extends Class> list
    }
    private static void printConsultaAnimal(List<? super Animal> animals){ // aceita qualquer classe que seja 'superior' a Animal, no caso Object
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
