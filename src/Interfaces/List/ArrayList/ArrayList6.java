package Interfaces.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Om Prakash Mallik", 23);
        Student s2 = new Student(102, "Jay Prakash Mallik", 21);
        Student s3 = new Student(103, "Sachin Kr. Mallik", 19);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        // iterating the collection
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.roll+" "+st.name+" "+st.age);
        }
    }
}

class Student {
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}
