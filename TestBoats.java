/*************************************************************************
	> File Name: TestBoats.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 21时51分07秒
 ************************************************************************/
class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.println("stroke natasha");
    }
}

class Boat {
    private int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength() {
        return length;
    }
    public void move() {
        System.out.print("drift ");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

