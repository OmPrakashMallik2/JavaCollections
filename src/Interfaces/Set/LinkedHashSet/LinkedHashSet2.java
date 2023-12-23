package Interfaces.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("one");
        linkedHashSet.add("three");
        linkedHashSet.add("four");

        System.out.println(linkedHashSet);
    }
}
