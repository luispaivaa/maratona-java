package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis Henrique", 9000, 12345678);
        Desenvolvedor dev = new Desenvolvedor("Fulano de Tal", 8500, 87456123);

        System.out.println(gerente);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();
    }
}