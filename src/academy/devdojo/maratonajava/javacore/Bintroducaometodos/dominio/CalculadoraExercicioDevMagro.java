package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class CalculadoraExercicioDevMagro {
    //Desafio 1: Crie uma calculadora que verfica se o número é primo ou não.
    //Retorna TRUE se for e FALSE se não for.

    public boolean verificaNumeroPrimo(int numero){
        int divisoresEncontrados = 0;

        if(numero <= 1){
            return false;
        }

        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                divisoresEncontrados++;
            }
        }
        if(divisoresEncontrados > 2){
            return false;
        }
        return true;
    }

    /*
    * Desafio 2: Crie uma calculadora que recebe uma lista/array e retorna a lista
    * com seus valores multiplicados por 2.
    * Ex: Se a lista for [1,2,3] o retorno deve ser [2,4,6].
    * */

    public int[] multiplicaListaPorDois(int[] listaDeNumeros) {
        if(listaDeNumeros == null || listaDeNumeros.length == 0){
            return new int[0];
        }

        int[] listaOriginalVezesDois = new int[listaDeNumeros.length];

        for (int i = 0; i < listaDeNumeros.length ; i++) {
            listaOriginalVezesDois[i] = listaDeNumeros[i] * 2;
        }
        return listaOriginalVezesDois;
    }

    /*
    *Desafio 3:
    * "Crie um método que recebe uma lista de números e devolve apenas os números pares."
    * */

    public int[] identificaNumerosPares(int[] listaDeNumeros){
        if(listaDeNumeros == null || listaDeNumeros.length == 0){
            return new int[0];
        }

        int quantidadeDeNumerosPares = 0;
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if(listaDeNumeros[i] % 2 == 0){
                quantidadeDeNumerosPares++;
            }
        }

        int[] listaDeNumerosPares = new int[quantidadeDeNumerosPares];

        int indiceNovoArray = 0;

        for (int i = 0; i < listaDeNumeros.length; i++) {
            if(listaDeNumeros[i] % 2 == 0){
                listaDeNumerosPares[indiceNovoArray] = listaDeNumeros[i];
                indiceNovoArray++;
            }
        }
        return listaDeNumerosPares;
    }

}