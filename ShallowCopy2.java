/*************************************************************************
	> File Name: ShallowCopy2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 12时24分56秒
 ************************************************************************/
import java.util.Arrays;
class Clothes {
    String color;
    char size;
    Clothes(String color, char size) {
        this.color = color;
        this.size = size;
    }
}
public class ShallowCopy2 {
    public static void main(String[] args) {
        Clothes[] c1 = {new Clothes("red", 'L'),new Clothes("blue",'M')};
        Clothes[] c2 = Arrays.copyOf(c1,c1.length);
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}

