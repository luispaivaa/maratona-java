package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClienteComEnumeration;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClienteTipo;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClienteTipoPagamento;

public class ClienteTest02 {
    public static void main(String[] args) {
        ClienteComEnumeration cliente1 = new ClienteComEnumeration("Reginaldo", ClienteTipo.PESSOA_FISICA, ClienteTipoPagamento.DÉBITO);
        ClienteComEnumeration cliente2 = new ClienteComEnumeration("Lucas", ClienteTipo.PESSOA_JURIDICA, ClienteTipoPagamento.CRÉDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println();

        System.out.println(ClienteTipoPagamento.CRÉDITO.calcularDesconto(100));
        System.out.println(ClienteTipoPagamento.DÉBITO.calcularDesconto(100));

        ClienteTipo clienteTipo = ClienteTipo.valueOf("PESSOA_FISICA");
        System.out.println(clienteTipo.getNomeRelatorio());

        ClienteTipo clienteTipo2 = ClienteTipo.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(clienteTipo2);

        int clienteTipo3 = ClienteTipo.tipoClientePorCodigoCliente("Pessoa Física");
        System.out.println(clienteTipo3);
    }
}
