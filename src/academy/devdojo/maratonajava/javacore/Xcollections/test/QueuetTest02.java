package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Filme;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class FilmeQtdEstoqueComparator implements Comparator<Filme>{
    @Override
    public int compare(Filme o1, Filme o2) { // organiza os filmes pela quantidade em estoque
        return Integer.compare(o1.getQuantidade(), o2.getQuantidade());
    }
}

public class QueuetTest02 {
    public static void main(String[] args) {
        Queue<Filme> filmes = new PriorityQueue<>(new FilmeQtdEstoqueComparator().reversed()); // implementa Comparator do preço. Por padrão, usa ordenação expressa na classe Filme (ordenação por título)
        filmes.add(new Filme(1L,"Guerra Mundial Z", 20.99, 0));
        filmes.add(new Filme(4L,"Nada de Novo no Front", 15.8, 5));
        filmes.add(new Filme(3L,"O Incrível Hulk", 10.19, 0));
        filmes.add(new Filme(7L,"Os Vingadores: Ultimato", 24.99, 2));
        filmes.add(new Filme(2L,"Homem de Ferro 1", 22.99,0));

        while (!filmes.isEmpty()){
            System.out.println(filmes.poll());
        }
    }
}
