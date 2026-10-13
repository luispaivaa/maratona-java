package academy.devdojo.maratonajava.javacore.Xcollections.test;

import academy.devdojo.maratonajava.javacore.Xcollections.domain.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest02 {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();
        pessoaList.add(new Pessoa("Luis", 21, 'M'));
        pessoaList.add(new Pessoa("Ana", 17, 'F'));
        pessoaList.add(new Pessoa("Paulo", 31, 'M'));
        pessoaList.add(new Pessoa("Julia", 19, 'F'));
        pessoaList.add(new Pessoa("Emilly", 21, 'F'));
        pessoaList.add(new Pessoa("Joao", 15, 'M'));

        Iterator<Pessoa> iteratorPessoa = pessoaList.iterator();
        System.out.println(iteratorPessoa.next());
        System.out.println("################################");
        while (iteratorPessoa.hasNext()){
            System.out.println(iteratorPessoa.next());
        }

//        while (iteratorPessoa.hasNext()){
//            int idade = iteratorPessoa.next().getIdade();
//            if (idade < 18){
//                iteratorPessoa.remove();
//            }
//        }


        // é necesaŕio criar um novo iterator, pois ele não reseta quando termina de percorrer os elementos da lista
        Iterator<Pessoa> it2 = pessoaList.iterator();
        while (it2.hasNext()){
            int idade = it2.next().getIdade();
            if (idade < 18){
                it2.remove();
            }
        }
        System.out.println("################################");
        for (Pessoa pessoa : pessoaList) {
            System.out.println(pessoa);
        }

    }
}
