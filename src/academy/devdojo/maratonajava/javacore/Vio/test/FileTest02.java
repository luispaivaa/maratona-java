package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println("Creted Directory ?" + isDirectoryCreated);
//      File directoryFile = new File("/home/luispaiva/Documents/dev/devDojo/maratona-java/folder/arquivo.txt");
        File directoryFile = new File(directory, "arquivo.txt");
        boolean isFileCreated = directoryFile.createNewFile();
        System.out.println("Created File ? " + isFileCreated);

        File renamed = new File(directory,"renamed-file.txt");
        boolean isRenamed = directoryFile.renameTo(renamed);
        System.out.println("Renamed File ? " + isRenamed);

        File renamedDirectory = new File("renamed-directory");
        boolean isRenamedDirectory = directory.renameTo(renamedDirectory);
        System.out.println("Renamed Directory ? " + isRenamedDirectory);
    }
}
