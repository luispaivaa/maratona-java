package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Ygenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Jangada")));

//        barcoList.sort(new BarcoNameComparator());

        // ou

        barcoList.sort(new Comparator<Barco>() { // classe anônima. Usada somente nesse trecho. Sem necessidade de criar outra classe por fora para ser usada nesse trecho.
            // só sera utilizada aqui nesse caso.
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
