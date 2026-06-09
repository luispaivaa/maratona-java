package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args){
        //byte, short, int, long, float, long e double --> 0
        // char --> '\u0000' ' '
        // boolean --> false
        // String --> null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Vegeta";

       // nomes = new String[4];
        //Garbage collector ativado e apaga o ultimo array nomes


        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
