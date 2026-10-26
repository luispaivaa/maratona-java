package academy.devdojo.maratonajava.javacore.Ygenerics.test;

import academy.devdojo.maratonajava.javacore.Ygenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Ygenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Ygenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Celta"), new Carro("Uno")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Lancha")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
