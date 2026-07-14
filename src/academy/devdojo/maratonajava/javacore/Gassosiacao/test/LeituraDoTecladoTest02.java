package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O GRANDE SOFTWARE DE PREVISÃO DO FUTURO.");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO.");
        System.out.println();

        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
