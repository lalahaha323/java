/*************************************************************************
	> File Name: Shuffle1.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月20日 星期二 21时52分53秒
 ************************************************************************/

class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.println("d");
                x = x - 1;
            }
        }
    }
}

