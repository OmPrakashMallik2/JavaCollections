package Interfaces.List.ArrayList;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // adding objects to the list
        arrayList.add("Ram");
        arrayList.add("shyam");
        arrayList.add("rohan");
        arrayList.add("mohan");

        // traverse lis through iterator
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
