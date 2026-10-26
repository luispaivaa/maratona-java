package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // Todas as regras da classe mãe (Animal) estarão atreladas a classe anônima
        Animal animal = new Animal() { // criação da classe anônima
            public void walk() {
                System.out.println("Walking in the shadows."); // usada para alterações específicas/pontuais no código
            }

        };
        animal.walk();
    }
}
