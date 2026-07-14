package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;


public class Anime {
    private String nome;
    private int[] epsodios;

    {
        //Criando bloco de inicialização
        //Executado todas as vezes que for criado uma instância do objeto Anime
        System.out.println("Dentro do bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length ; i++) {
            epsodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int epsodio : this.epsodios){
            System.out.print(epsodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
