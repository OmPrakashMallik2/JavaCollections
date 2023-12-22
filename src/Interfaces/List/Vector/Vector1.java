package Interfaces.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("one");
        vector.add("two");
        vector.add("three");
        vector.add("four");

        // iteration
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
