package Interfaces.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("one");
        priorityQueue.add("two");
        priorityQueue.add("three");
        priorityQueue.add("four");
        priorityQueue.add("five");
        priorityQueue.add("six");
        priorityQueue.add("seven");
        priorityQueue.add("eight");
        priorityQueue.add("nine");
        priorityQueue.add("ten");

        System.out.println(priorityQueue);
        System.out.println("Head : "+priorityQueue.element());
        System.out.println("Head : "+priorityQueue.peek());

        System.out.println("remove : "+priorityQueue.remove());
        System.out.println("poll : "+priorityQueue.poll());
    }
}
