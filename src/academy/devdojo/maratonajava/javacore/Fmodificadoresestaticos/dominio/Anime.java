package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static { // EXECUTADO APENAS UMA VEZ, QUANDO A JVM CARREGA A CLASSE
        System.out.println("Dentro do bloco de inicialização ESTÁTICO 1;");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static{
        System.out.println("Dentro do bloco de inicialização ESTÁTICO 2;");
    }

    static{
        System.out.println("Dentro do bloco de inicialização ESTÁTICO 3;");
    }

    {
        //Criando bloco de inicialização NÃO ESTÁTICO
        //Executado todas as vezes que for criado uma instância do objeto Anime.
        System.out.println("Dentro do bloco de inicialização NÃO ESTÁTICO");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setEpsodios(int[] epsodios) {
        Anime.episodios = epsodios;
    }

}


