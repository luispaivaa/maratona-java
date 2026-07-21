package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClienteSemEnumeration;

public class ClienteTest01 {
    public static void main(String[] args) {
        ClienteSemEnumeration cliente1 = new ClienteSemEnumeration("Roberto", ClienteSemEnumeration.PESSOA_FISICA);
        ClienteSemEnumeration cliente2 = new ClienteSemEnumeration("Maxwell", ClienteSemEnumeration.PESSOA_JURIDICA);
        ClienteSemEnumeration cliente3 = new ClienteSemEnumeration("Regis", "Pessoa juridica");
        ClienteSemEnumeration cliente4 = new ClienteSemEnumeration("Dagoberto", "pessoa Juridica");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
