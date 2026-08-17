package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Luis";
        String nome2 = "Luis";
        nome = nome.concat(" Henrique");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Luis");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
