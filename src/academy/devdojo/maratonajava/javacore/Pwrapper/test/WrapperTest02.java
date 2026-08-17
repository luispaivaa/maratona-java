package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest02 {
    public static void main(String[] args) {
        int x = 128;
        int y = 128;

        System.out.println(x == y);

        Integer i = new Integer(128);
        Integer j = new Integer(128);
        System.out.println(i == j);

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);

        //UTILIZANDO EQUALS()
        Integer p = 128;
        Integer q = 128;
        System.out.println(p.equals(q));
    }
}
