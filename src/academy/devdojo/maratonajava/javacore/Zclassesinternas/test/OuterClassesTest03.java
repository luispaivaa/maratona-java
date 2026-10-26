package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Luis";

    static class Nested {
        private String lastName = "Paiva";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new Nested();
        nested.print();
    }
}
