package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest04 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("Luis");
        stringQueue.add("Henrique");
        stringQueue.add("Paiva");

        Iterator<String> iterator = stringQueue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println(stringQueue);
        while (!stringQueue.isEmpty()){
            System.out.println(stringQueue.poll());
        }
    }
}
