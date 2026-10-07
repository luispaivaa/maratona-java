package academy.devdojo.maratonajava.javacore.Xcollections.domain;

import java.util.Objects;

public class Filme implements Comparable<Filme> {
    private Long id;
    private String titulo;
    private double preco;

    public Filme(Long id, String titulo, double preco) {
        Objects.requireNonNull(id, "Id não poder ser null");
        Objects.requireNonNull(titulo, "Título não pode ser null");
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filmes = (Filme) o;
        return id == filmes.id && Double.compare(preco, filmes.preco) == 0 && Objects.equals(titulo, filmes.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, preco);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public int compareTo(Filme outroFilme) {
        /*
        * negativo se o this < outroFilme
        * se this == outroFilme, return 0
        * positivo se this > outroFilme
        * */

        // ORDENAÇÃO PELO ID:
//        if(this.id < outroFilme.getId()){
//            return -1;
//        } else if (this.id.equals(outroFilme.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        //ORDENAÇÃO POR TÍTULO:
//        return this.titulo.compareTo(outroFilme.getTitulo());

        //ORDENAÇÃO POR PREÇO:
        return Double.compare(this.preco, outroFilme.getPreco());
    }
}
