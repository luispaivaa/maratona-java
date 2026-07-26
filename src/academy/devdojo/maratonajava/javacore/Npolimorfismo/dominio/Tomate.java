package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade; // Só é pçossível acessar esse atributo atráves de um objeto do tipo TOMATE.

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate... ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
