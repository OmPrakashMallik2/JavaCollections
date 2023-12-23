package Interfaces.Queue.Deque;

import java.util.ArrayDeque;

public class ArrayDeque2 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("OPM");
        arrayDeque.add("JPM");
        arrayDeque.add("SKM");
        arrayDeque.add("other1");
        arrayDeque.add("other2");

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque.pollFirst());

        System.out.println(arrayDeque);
    }
}
