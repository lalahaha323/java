/*************************************************************************
	> File Name: Person.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月08日 星期三 18时07分57秒
 ************************************************************************/
import java.io.*;
public class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}

