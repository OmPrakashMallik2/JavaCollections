package Interfaces.Iterables;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        for(int i=1; i<=10; i++){
            vector.add(i);
        }
        System.out.println(vector);

        Iterator<Integer> e = vector.iterator();
        System.out.print("iterator : ");
        while (e.hasNext()){
            int j = e.next();
            if(j%2 == 0){
                System.out.print(" "+j);
            } else {
                e.remove();
            }
        }
        System.out.println();
        System.out.println(vector);
    }
}
