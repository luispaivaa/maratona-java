package academy.devdojo.maratonajava.javacore.Xcollections.domain;

import java.util.Objects;

public class Filmes {
    private long id;
    private String titulo;
    private double preco;

    public Filmes(long id, String titulo, double preco) {
        Objects.requireNonNull(id, "Id não poder ser null");
        Objects.requireNonNull(titulo, "Título não pode ser null");
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return id == filmes.id && Double.compare(preco, filmes.preco) == 0 && Objects.equals(titulo, filmes.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, preco);
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
