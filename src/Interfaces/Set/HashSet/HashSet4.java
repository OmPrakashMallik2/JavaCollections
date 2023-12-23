package Interfaces.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("apple");
        arrayList1.add("mango");
        arrayList1.add("banana");


        HashSet<String> hashSet1 = new HashSet<>(arrayList1);
        hashSet1.add("one");
        hashSet1.add("two");
        hashSet1.add("three");
        System.out.println(hashSet1);
    }
}
