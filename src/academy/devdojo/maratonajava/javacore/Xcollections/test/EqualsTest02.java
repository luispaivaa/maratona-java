package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Smartphone;

public class EqualsTest02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("3DFG3", "Motorola");
        Smartphone s2 = new Smartphone("3DFG3", "Motorola");

        System.out.println(s1.equals(s2));
        //S1 e S2 são dois objetos diferentes em memória. Apesar de possuírem o mesmo contéudo, apontam
        // para locais diferente em memória.

        //Para o resultado ser TRUE e resolver isso, eles teriam que apontar para mesmo endereço em memória
        //Exemplo abaixo:

        Smartphone s3 = new Smartphone("1ABC1", "Xiaomi");
        Smartphone s4 = s3;
        System.out.println(s3.equals(s4));
    }
}
