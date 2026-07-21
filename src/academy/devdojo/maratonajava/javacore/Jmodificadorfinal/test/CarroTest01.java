package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Celta");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Shikamaru Nara");
        System.out.println(carro.COMPRADOR);
        System.out.println("-------------------------------------------");

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        System.out.println("Chamando o método 'public final void imprime()' da Super Classe: ");
        ferrari.imprime();

        System.out.println("Chamando o método 'public void imprime2()', da Sub Classe, sobreescrevendo o método imprime() da Super Classe: ");
        ferrari.imprime2();

    }
}
