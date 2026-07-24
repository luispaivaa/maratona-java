package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; // por padrão, todos os atributos dentro de interfaces são constantes

    void load(); // por padrão os métodos são públicos e abstratos

    default void checkPermission(){
        System.out.println("Checando permissões dos dados.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface. ");
    }
}