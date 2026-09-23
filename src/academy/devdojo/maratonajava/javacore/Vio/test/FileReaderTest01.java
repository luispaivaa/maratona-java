package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/luispaiva/Documents/dev/devDojo/maratona-java/src/academy/devdojo/maratonajava/javacore/Vio/created-files-test/arquivo-02.txt");
        try (FileReader fr = new FileReader(file)) {
            char[] in = new char[30];
            fr.read(in); // retorna um valor inteiro; Valor da tabela ASCII do caractere lido. Para mostrar o caractere proprieamente é necessário converter o retorno do método de inteiro para char
            for (char c : in) {
                System.out.print(c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
