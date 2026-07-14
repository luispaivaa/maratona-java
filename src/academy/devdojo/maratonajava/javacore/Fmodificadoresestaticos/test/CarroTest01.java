package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("Mercedes", 300);
        Carro c3 = new Carro("Ferrari", 295);


        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 300;
        System.out.println(Carro.velocidadeLimite);


        c1.setVelocidadeMaxima(500);
        c1.setVelocidadeLimite(230); // JVM lê Carro.velocidadeMaxima = 230;
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
