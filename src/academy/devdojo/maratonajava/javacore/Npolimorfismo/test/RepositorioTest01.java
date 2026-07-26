package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        System.out.println("### Programação Orientada a Interfaces ###");
        System.out.println("--------------------------------------------------");

        Repositorio repositorio = new RepositorioBancoDeDados(); //consigo acessar cada método específico apenas mundando a instância do objeto.
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Trunks");
        list.add("Vegeto");
        System.out.println(list);
    }
}
