package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum ClienteTipo {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int codigoCliente;
    private final String nomeRelatorio;

    ClienteTipo(int codigoCliente, String nomeRelatorio) {
        this.codigoCliente = codigoCliente;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static ClienteTipo tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (ClienteTipo clienteTipo : values()) {
            if(clienteTipo.getNomeRelatorio().equals(nomeRelatorio)){
                return clienteTipo;
            }
        }
        return null;
    }

    public static int tipoClientePorCodigoCliente(String nomeRelatorio){
        for (ClienteTipo clienteTipo : values()) {
            if(clienteTipo.getNomeRelatorio().equals(nomeRelatorio)){
                return clienteTipo.getCodigoCliente();
            }
        }
        return -1;
    }



    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
