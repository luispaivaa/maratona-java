package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();

//        anime01.setNome("Naruto Shippuden");
//        anime01.setEpsodios(500);
//        anime01.setTipo("TV");

        anime01.init("Naruto","TV", 500);
        anime01.init("Naruto","TV", 500, "Ação");

//        anime01.setGenero("Aventura");
        anime01.imprime();
    }
}
