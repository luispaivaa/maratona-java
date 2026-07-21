package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class ClienteComEnumeration {
    private String nome;
    private ClienteTipo clienteTipo;
    private ClienteTipoPagamento clienteTipoPagamento;


    public ClienteComEnumeration(String nome, ClienteTipo clienteTipo, ClienteTipoPagamento clienteTipoPagamento) {
        this.nome = nome;
        this.clienteTipo = clienteTipo;
        this.clienteTipoPagamento = clienteTipoPagamento;
    }

    @Override
    public String toString() {
        return "ClienteComEnumeration{" +
                "nome='" + nome + '\'' +
                ", clienteTipo=" + clienteTipo.getNomeRelatorio() +
                ", códigoCliente=" + clienteTipo.getCodigoCliente() +
                ", tipoPagamento=" + clienteTipoPagamento +
                '}';
    }
}
