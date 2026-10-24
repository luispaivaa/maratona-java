package academy.devdojo.maratonajava.javacore.Ygenerics.test;

class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public void setKey(K key){ this.key = key; }

    public K getKey(){ return this.key; }

    public V getValue(){ return this.value; }
}

public class GenericsTest02 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(433, "Java");
        System.out.println("Key: " + pair.getKey() + " - Instace of: " + pair.getKey().getClass());
        System.out.println("Value: " + pair.getValue() + " - Instance of: " + pair.getValue().getClass());
    }
}
