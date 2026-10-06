package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTes02 {
    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();
        carros.add("Camaro");
        carros.add("Polo");
        carros.add("Pegeuot 208");

        List<String> motos = new ArrayList<>();
        motos.add("Kawasaki Ninja");
        motos.add("CG Titan");
        motos.add("Lander XTZ");

        System.out.println("List Carros: ");
        for (String carro : carros) {
            System.out.println(carro);
        }

        System.out.println("-------------------");
        System.out.println("List Motos: ");
        for (int i = 0; i < motos.size() ; i++) {
            System.out.println(motos.get(i));
        }

        System.out.println("---------------------");
        List<String> veiculos = new ArrayList<>();
        veiculos.addAll(carros);
        veiculos.addAll(motos);
        veiculos.remove(3);
        // ou veiculos.remove("Camaro");   -utiliza o equals

        System.out.println("List Veículos (carros e motos):");
        for (String veiculo : veiculos) {
            System.out.println(veiculo);
        }


    }
}
