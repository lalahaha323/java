/*************************************************************************
	> File Name: PoorDogTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 19时25分09秒
 ************************************************************************/
class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}
public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}

