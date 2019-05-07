/*************************************************************************
	> File Name: EnumMapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 18时28分31秒
 ************************************************************************/
import java.util.*;
enum Season {
    SPRING,SUMMER,FALL,WINTER
}
public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Season.class);
        enumMap.put(Season.SUMMER, "夏天");
        enumMap.put(Season.SPRING, "春天");
        System.out.println(enumMap);
    }
}

