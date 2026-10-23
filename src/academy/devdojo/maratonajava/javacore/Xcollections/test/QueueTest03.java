package academy.devdojo.maratonajava.javacore.Xcollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest03 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(14);
        priorityQueue.add(78);
        priorityQueue.add(50);
        priorityQueue.add(2);
        priorityQueue.add(32);

        System.out.println("Priority queue: " + priorityQueue);
    }
}
