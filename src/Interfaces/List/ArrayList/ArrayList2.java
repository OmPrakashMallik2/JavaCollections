package Interfaces.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Orange");

        // print arraylist
        System.out.println(arrayList);

        // iteration using iterator interface
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //iteration using for each loop
        for(String str : arrayList){
            System.out.println(str);
        }
    }
}
