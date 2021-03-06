/*************************************************************************
	> File Name: CloneTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月10日 星期五 18时20分00秒
 ************************************************************************/
class Address {
    String detail;
    public Address(String detail) {
        this.detail = detail;
    }
}
class User implements Cloneable {
    int age;
    Address address;
    public User(int age) {
        this.age = age;
        address = new Address("lala");
    }
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}
