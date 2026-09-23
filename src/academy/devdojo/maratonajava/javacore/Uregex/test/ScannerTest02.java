package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Luis Henrique Âncores Paiva";
        String[] nomes = texto.split(" ");
        int i = 1;
        for (String nome : nomes) {
            System.out.println("Nome " + i + " : " + nome.trim());
            i++;
        }

    }
}
