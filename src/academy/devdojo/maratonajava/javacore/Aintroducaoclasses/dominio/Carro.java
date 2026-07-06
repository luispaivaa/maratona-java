package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }

    public int ano;
}
