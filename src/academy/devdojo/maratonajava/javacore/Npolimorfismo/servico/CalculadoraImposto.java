package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println(" * RELATÓRIO IMPOSTO * ");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getValor());
        System.out.println("Imposto à ser pago: R$ " + imposto);
        if (produto instanceof Tomate) {
//            Tomate tomate = (Tomate) produto;
            // ou
            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
        System.out.println("--------------------------------------------");
    }
}
