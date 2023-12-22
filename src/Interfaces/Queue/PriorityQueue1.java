package Interfaces.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Mango");
        priorityQueue.add("guava");
        priorityQueue.add("fruit");

        System.out.println("Head :"+priorityQueue.peek());
        System.out.println("Head :"+priorityQueue.element());

        System.out.println("Iterating the queue elements");

        Iterator<String> itr = priorityQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        priorityQueue.remove();
        priorityQueue.poll();

        System.out.println("After removing two elements");
        Iterator<String> itr2 = priorityQueue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
