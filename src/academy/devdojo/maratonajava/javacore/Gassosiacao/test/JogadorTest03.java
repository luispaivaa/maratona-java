package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogadorBocaJuniors01 = new Jogador("Juan Román Riquelme");
        Jogador jogadorBocaJuniors02 = new Jogador("Carlito Tévez");
        Jogador jogadorFlamengo01 = new Jogador("Adriano Imperador");
        Jogador jogadorFlamengo02 = new Jogador("Ronaldo Angelim");

        Jogador[] jogadoresBocaJuniors = {jogadorBocaJuniors01, jogadorBocaJuniors02};
        Jogador[] jogadoresFlamengo = {jogadorFlamengo01, jogadorFlamengo02};

        Time bocaJuniors = new Time("Boca Júniors");
        Time flamengo = new Time("Flamengo", jogadoresFlamengo);

        jogadorBocaJuniors01.setTime(bocaJuniors);
        bocaJuniors.setJogadores(jogadoresBocaJuniors);


//        System.out.println("===== JOGADOR 01 =====");
//        jogadorBocaJuniors01.imprime();

//        System.out.println("===== TIME CASA =====");
        bocaJuniors.imprime();

//        System.out.println("===== JOGADOR 02 =====");
//        jogadorBocaJuniors02.imprime();
        System.out.println();

//        System.out.println("===== TIME FORA =====");
        flamengo.imprime();

    }
}
