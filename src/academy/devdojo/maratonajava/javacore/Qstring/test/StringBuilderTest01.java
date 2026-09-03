package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Luis Henrique";
        nome.concat(" Ancores Paiva");
        nome.substring(0,3);
        System.out.println(nome);

        /// ///////////////////////////////

        StringBuilder sb = new StringBuilder("Luis Henrique");
        sb.append(" Âncores").append(" Paiva");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
