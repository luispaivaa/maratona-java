package academy.devdojo.maratonajava.javacore.Xcollections.domain;

import java.util.Objects;

public class Filme implements Comparable<Filme> {
    private Long id;
    private String titulo;
    private double preco;
    private int quantidade;

    public Filme(Long id, String titulo, double preco) {
        Objects.requireNonNull(id, "Id não poder ser null");
        Objects.requireNonNull(titulo, "Título não pode ser null");
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    public Filme(Long id, String titulo, double preco, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(titulo, filme.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
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
        return this.titulo.compareTo(outroFilme.getTitulo());

        //ORDENAÇÃO POR PREÇO:
//        return Double.compare(this.preco, outroFilme.getPreco());
    }
}
