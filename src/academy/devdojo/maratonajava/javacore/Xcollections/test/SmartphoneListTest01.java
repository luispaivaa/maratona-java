package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();
        Smartphone s1 = new Smartphone("1ABC1", "Apple");
        Smartphone s2 = new Smartphone("333G", "Samsung");
        Smartphone s3 = new Smartphone("444T0", "Pixel");
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(new Smartphone("AANHHSK882M", "Motorola"));

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println("#####################");

        Smartphone s5 = new Smartphone("333G", "Samsung");
        System.out.println(smartphones.contains(s5)); //usa o equals() por debaixo dos panos para verificar.
        int indexSmartphone5 = smartphones.indexOf(s5); //também usa o equals()
        System.out.println(smartphones.get(indexSmartphone5));
        System.out.println("Posição do smartphone duplicado -> " + indexSmartphone5);

        System.out.println("#####################");

        Smartphone s6 = new Smartphone("ABCDE8", "Zenphone");
        smartphones.add(2, s6); // adcione na posição 2 da lista o s6
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }


    }
}
