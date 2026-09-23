package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest03 {
    public static void main(String[] args) {
        String texto = "Luis,Henrique,true,1.5,28";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextDouble()){
                double d = scanner.nextDouble();
                System.out.println("Double " + d);
            } else {
                String string = scanner.next();
                System.out.println("String " + string);
            }

        }
    }
}
