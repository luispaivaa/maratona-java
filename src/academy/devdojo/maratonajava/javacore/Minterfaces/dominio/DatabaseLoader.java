package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da classe DatabaseLoader. ");
    }


}
