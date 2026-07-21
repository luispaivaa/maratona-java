package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //CONSTANTE
    public final Comprador COMPRADOR = new Comprador();

    public Carro() {
    }

    public final void imprime(){
        System.out.println(this.nome);
    }

    public Carro(String nome){
        this.nome = nome;
        System.out.println("Carro: " + this.nome + " | Velocidade Limite: " + VELOCIDADE_LIMITE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}