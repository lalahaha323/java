/*************************************************************************
	> File Name: DogTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 22时03分20秒
 ************************************************************************/
class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}
public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
