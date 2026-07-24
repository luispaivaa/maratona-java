package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {
    default void remove(){
        System.out.println("Removendo dados.");
    } // métodos default necessitam de um body
}
