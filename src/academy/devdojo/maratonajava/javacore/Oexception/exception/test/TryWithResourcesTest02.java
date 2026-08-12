package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesTest02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("src/academy/devdojo/maratonajava/javacore/Oexception/exception/test/teste.text"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
