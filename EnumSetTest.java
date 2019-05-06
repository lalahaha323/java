/*************************************************************************
	> File Name: EnumSetTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 21时01分57秒
 ************************************************************************/
import java.util.*;
enum Season {
    SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);
        EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
    }
}

