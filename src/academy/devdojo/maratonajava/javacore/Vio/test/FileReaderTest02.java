package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest02 {
    public static void main(String[] args) {
        File file = new File("/home/luispaiva/Documents/dev/devDojo/maratona-java/src/academy/devdojo/maratonajava/javacore/Vio/created-files-test/arquivo-02.txt");
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1){ // quando não há mais caracteres para serem lidos o método retorna -1.
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
