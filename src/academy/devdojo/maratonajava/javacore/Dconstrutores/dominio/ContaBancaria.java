package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String status;

    //Construtor explícito! Pede o titular mas o saldo e o status são atribuídos automaticamente.
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
        this.status = "ATIVA";
    }

    public void imprimeDados(){
        System.out.println(this.titular);
        System.out.println(this.saldo);
        System.out.println(this.status);
    }
}
