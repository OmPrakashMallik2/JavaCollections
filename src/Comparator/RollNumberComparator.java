package Comparator;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.rollNumber > o2.rollNumber){
            return 1;
        }else if(o1.rollNumber < o2.rollNumber){
            return -1;
        }
        return 0;
    }
}
