package Interfaces.List.Stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.pop();
        System.out.println(stack.peek());

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
