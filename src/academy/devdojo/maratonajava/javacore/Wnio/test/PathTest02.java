package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("nio-folder-test");
        if(Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectory(folderPath);
        }

        Path subfolderPath = Paths.get("nio-folder-test/subfolder/subfolder");
        Path subFolderDirectory = Files.createDirectories(subfolderPath);
        Path filePath = Paths.get(subfolderPath.toString(), "file-test.txt");

        if(Files.notExists(filePath)){
            Path fileCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamed-nio-file.text"); // getParent() pega o diretório PAI do arquivo. Volta uma casa.
        System.out.println(target.toString());
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
