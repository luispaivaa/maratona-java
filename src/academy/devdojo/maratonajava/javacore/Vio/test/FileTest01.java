package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/luispaiva/Documents/dev/devDojo/maratona-java/src/academy/devdojo/maratonajava/javacore/Vio/created-files-test/arquivo01.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("absolute path " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("is file " + file.isFile());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();

//            if (exists){
//                boolean isDeleted = file.delete();
//                System.out.println("Deleted: " + isDeleted);
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
