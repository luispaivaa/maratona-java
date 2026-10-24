package academy.devdojo.maratonajava.javacore.Ygenerics.test;

class Box<T> {
    private T data;

    public void setData(T data) { this.data = data; }

    public T getData(){ return data; }

}

public class GenericsTest01 {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.setData(100);
        stringBox.setData("Luis");

        System.out.println(integerBox.getData());
        System.out.println(stringBox.getData());
    }
}
