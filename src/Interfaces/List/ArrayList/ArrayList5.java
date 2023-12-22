package Interfaces.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList5 {
    public static void main(String[] args) {
        // sorting the arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(73);
        arrayList.add(52);
        arrayList.add(28);
        arrayList.add(14);
        arrayList.add(93);

        System.out.println(arrayList);

        // iteration
        System.out.println("iteration using Iterator");
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // using for loop
        System.out.println("Iteration using for loop");
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // using for each loop
        System.out.println("Iteration using for each loop");
        for(Integer i : arrayList){
            System.out.println(i);
        }
    }
}
