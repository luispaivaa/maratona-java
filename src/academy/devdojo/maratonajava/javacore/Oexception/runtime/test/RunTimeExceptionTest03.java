package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Lendo dados do arquivo.");
            return "Abre conexão";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // O bloco FINALLY sempre será executado, sempre. Mesmo havendo uma exceção antes dele.
            System.out.println("Fechando recurso liberado pelo Sistema Operacional.");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Lendo dados do arquivo.");
            throw new RuntimeException();
        }  finally {
            // O bloco FINALLY sempre será executado, sempre. Mesmo havendo uma exceção antes dele.
            System.out.println("Fechando recurso liberado pelo Sistema Operacional.");
        }
    }
}
