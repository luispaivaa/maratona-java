package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // <key, value>. HashMap não mantém a ordem de inserção
        map.put("galfo", "garfo");
        map.put("auga", "água");
        map.put("mause", "mouse");
        map.put("teklado", "teclado");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); // nao pode
        map.putIfAbsent("vc2", "você");// pode

        System.out.println(map);
        System.out.println("----------------------------");
        for (String key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println("----------------------------");
        for (String value : map.values()){
            System.out.println(value);
        }
        System.out.println("----------------------------");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }



    }
}
