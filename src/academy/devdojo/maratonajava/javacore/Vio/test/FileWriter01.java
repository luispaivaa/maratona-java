package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("/home/luispaiva/Documents/dev/devDojo/maratona-java/src/academy/devdojo/maratonajava/javacore/Vio/created-files-test/arquivo-02.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Testando FileWriter\nQuebra de linha com FileWriter\nFileWriter fw = new FileWriter(file,true). O parâmetro true faz com que toda vez que a classe for executada, seja escrito no arquivo-02.txt, toda a String do método 'fw.write()'\nSem o true, ele apaga e escreve tudo de novo sempre que a classe é executada.");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
