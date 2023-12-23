package Interfaces.Queue.Deque;

import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> deque = new java.util.ArrayDeque<>();
        deque.add("One");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.add("five");

        for(String str : deque){
            System.out.println(str);
        }
    }
}
