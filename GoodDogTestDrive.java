/*************************************************************************
	> File Name: GoodDogTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 16时17分41秒
 ************************************************************************/
class GoodDog {
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }
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
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Gog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}

