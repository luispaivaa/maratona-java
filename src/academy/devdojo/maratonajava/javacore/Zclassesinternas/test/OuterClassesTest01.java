package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Vegeta";
// inner classes
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); // referência a classe interna
            System.out.println(OuterClassesTest01.this); // referencia a classe externa
        }
    }
    public static void main(String[] args){
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner(); // para criar um objeto da classe interna, é necessário primeiro criar um objeto da classe externa
        Inner inner2 = new OuterClassesTest01().new Inner(); // outra forma de criar objeto
        inner.printOuterClassAttribute();
        System.out.println("-----------------------");
        inner2.printOuterClassAttribute();
    }
}
