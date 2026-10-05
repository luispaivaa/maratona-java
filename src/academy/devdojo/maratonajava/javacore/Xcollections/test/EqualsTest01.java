package academy.devdojo.maratonajava.javacore.Xcollections.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Luis Henrique";
        String nome2 = "Luis Henrique";
        System.out.println(nome == nome2);
        // fazem referência ao mesmo espaço em memória. Pool de Strings.

        System.out.println("-------------------");
        String nome3 = new String("Luis Henrique");
        System.out.println(nome == nome3);
        //fazem referência a dois objetos distintos na memória. O '==' comopara o endereço em memória
        // não o conteúdo.

        System.out.println("-------------------");
        System.out.println(nome.equals(nome3));
        // compara o contéudo e não o endereço em memória. TRUE
    }
}
