package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Shikamaru";

    void print(final String param) {
        final String lastName = "Nara";

        class LocalCLass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalCLass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print("Nara");
    }
}
