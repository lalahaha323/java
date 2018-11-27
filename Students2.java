/*************************************************************************
	> File Name: Students2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 17时27分45秒
 ************************************************************************/
import java.util.*;

class Student2 {
    private String name;
    private String number;
    Student2(String name, String number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.number);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Student2 other = (Student2) obj;
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }
        if(!Objects.equals(this.number, other.number)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return String.format("(%s, %s)", name, number);
    }
}
public class Students2 {
    public static void main(String[] args) {
        Set students = new HashSet();
        students.add(new Student2("Justin", "B835031"));
        students.add(new Student2("Monica", "B835032"));
        students.add(new Student2("Justin", "B835031"));
        System.out.println(students);
    }
}

