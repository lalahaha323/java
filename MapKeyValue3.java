/*************************************************************************
	> File Name: MapKeyValue3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 20时52分10秒
 ************************************************************************/
import java.util.*;
public class MapKeyValue3 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");
        map.forEach(
                    (key, value) -> System.out.printf("(键 %s, 值 %s)%n", key, value)
                );
    }
}

