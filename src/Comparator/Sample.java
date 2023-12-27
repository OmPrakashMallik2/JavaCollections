package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101,"King",27));
        al.add(new Student(102,"Divine",28));
        al.add(new Student(103,"Stan",23));

//        Collections.sort(al, new NameComparator());
//        Collections.sort(al, new AgeComparator());
        Collections.sort(al, new RollNumberComparator());

        for (Student s : al){
            System.out.println("Roll: "+s.rollNumber);
            System.out.println("Name: "+s.name);
            System.out.println("Age: "+s.age);
            System.out.println(".....................");
        }
    }
}
