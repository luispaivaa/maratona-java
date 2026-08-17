package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        String numeroString = "2022";
        int numeroFormatoInteiro = Integer.parseInt(numeroString);

        int somaTeste = 15 + numeroFormatoInteiro;
        System.out.println("Soma = " + somaTeste);
    }
}
