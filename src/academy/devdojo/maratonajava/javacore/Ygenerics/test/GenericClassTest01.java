package academy.devdojo.maratonajava.javacore.Ygenerics.test;

import academy.devdojo.maratonajava.javacore.Ygenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Ygenerics.service.CarroRentavelService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
