package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Luis");
        nomes.add("Henrique");
        nomes.add("Paiva");

        System.out.println("Iterando List com foreach: ");
        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-------------");
        System.out.println("Iterando List com for padrão:");
        nomes.add("Âncores");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
