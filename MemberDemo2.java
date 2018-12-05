/*************************************************************************
	> File Name: MemberDemo2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 16时44分54秒
 ************************************************************************/
import java.io.*;
import static java.lang.System.out;

class Member2 implements Serializable {
    private String name;
    private String number;
    private int age;

    public Member2(String  number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)",number, name, age);
    }
    public void save() throws IOException {
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(number))) {
            output.writeObject(this);
        }
    }
    public static Member2 load(String number) throws IOException, ClassNotFoundException {
        Member2 member;
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(number))) {
            member = (Member2) input.readObject();
        }
        return member;
    }
}
public class MemberDemo2 {
    public static void main(String[] args) throws Exception {
        Member2[] members = {new Member2("B1234", "Justin", 90),
                            new Member2("B5678", "Monica", 95),
                            new Member2("B9876", "Irene", 88)};
        for(Member2 member : members) {
            member.save();
        }
        out.println(Member2.load("B1234"));
        out.println(Member2.load("B5678"));
        out.println(Member2.load("B9876"));
    }
}

