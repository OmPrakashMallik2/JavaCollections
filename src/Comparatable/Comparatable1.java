package Comparatable;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student> {
    int rollNumber;
    String Name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        Name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(age == o.age){
            return 0;
        } else if(age < o.age){
            return 1;
        }else{
            return -1;
        }
    }
}
public class Comparatable1 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student(1, "jay prakash mallik", 21));
        students.add(new Student(2, "santosh kr. mallik", 43));
        students.add(new Student(3, "sachin kr. mallik", 19));
        students.add(new Student(4, "om prakash mallik", 23));
        students.add(new Student(5, "rita devi", 38));

        System.out.println("------------------------------");
        for(Student s : students){
            System.out.println("Roll n.: "+s.rollNumber);
            System.out.println("Name: "+s.Name);
            System.out.println("Age: "+s.age);
            System.out.println("------------------------------");
        }

        Collections.sort(students);
        System.out.println("------------------------------");
        for(Student s : students){
            System.out.println("Roll n.: "+s.rollNumber);
            System.out.println("Name: "+s.Name);
            System.out.println("Age: "+s.age);
            System.out.println("------------------------------");
        }
    }
}
