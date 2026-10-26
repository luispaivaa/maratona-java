package academy.devdojo.maratonajava.javacore.Ygenerics.test;

import academy.devdojo.maratonajava.javacore.Ygenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Ygenerics.service.BarcoRentavelService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
