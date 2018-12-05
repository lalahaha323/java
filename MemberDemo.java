/*************************************************************************
	> File Name: MemberDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 16时12分08秒
 ************************************************************************/

import java.io.IOException;
import java.io.*;
import static java.lang.System.out;

class Member {
    private String number;
    private String name;
    private int age;

    public Member(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }

    public void save() throws IOException {
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream(number))) {
            output.writeUTF(number);
            output.writeUTF(name);
            output.writeInt(age);
        }
    }

    public static Member load(String number) throws IOException {
        Member member;
        try(DataInputStream input = new DataInputStream(new FileInputStream(number))) {
            member = new Member(
                    input.readUTF(),input.readUTF(),input.readInt()
                    );
        }
        return member;
    }
}
public class MemberDemo {
    public static void main(String[] args) throws IOException {
        Member[] members = {
            new Member("B1234", "Justin", 90),
            new Member("B5678", "Monica", 95),
            new Member("B9876", "Irene", 88)
        };
        for(Member member : members) {
            member.save();
        }
        out.println(Member.load("B1234"));
        out.println(Member.load("B5678"));
        out.println(Member.load("B9876"));
    }
}

