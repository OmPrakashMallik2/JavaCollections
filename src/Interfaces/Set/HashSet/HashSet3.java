package Interfaces.Set.HashSet;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("one");
        hashSet1.add("two");
        hashSet1.add("three");
        hashSet1.add("four");
        hashSet1.add("five");

        System.out.println(hashSet1);

        hashSet1.remove("one");
        System.out.println(hashSet1);

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("apple");
        hashSet2.add("mango");
        hashSet2.add("banana");

        hashSet1.addAll(hashSet2);
        System.out.println(hashSet1);

        hashSet1.removeAll(hashSet2);
        System.out.println(hashSet1);

        hashSet1.clear();
        System.out.println(hashSet1);
    }
}
