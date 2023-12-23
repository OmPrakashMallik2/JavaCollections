package Interfaces.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet3 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("king");
        linkedHashSet.add("divine");
        linkedHashSet.add("stan");
        linkedHashSet.add("ikka");
        linkedHashSet.add("badshah");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("stan");
        System.out.println(linkedHashSet);
    }
}
