package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;


public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void imprime(){
        System.out.println("-----------------------------------------------");
        System.out.println("Nome = " + this.nome);
        System.out.println("Velocidade Máxima = " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite = " + Carro.velocidadeLimite);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

//    public void setVelocidadeLimite(double velocidadeLimite){
//        this.velocidadeLimite = velocidadeLimite;
//    }

//    public double getVelocidadeLimite(){
//        return this.velocidadeLimite;
//    }
}
