package Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
public class Sorting3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("om"));
        students.add(new Student("prakash"));
        students.add(new Student("mallik"));
        students.add(new Student("jay"));
        students.add(new Student("sachin"));
        students.add(new Student("kumar"));
//        System.out.println(students);

        for(Student s : students){
            System.out.println(s.name);
        }

        System.out.println("................");
        Collections.sort(students);
        for(Student s : students){
            System.out.println(s.name);
        }
    }
}
