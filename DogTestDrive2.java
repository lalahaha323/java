/*************************************************************************
	> File Name: DogTestDrive2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 16时09分35秒
 ************************************************************************/
class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof!Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
class DogTestDrive2 {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}

