/*************************************************************************
	> File Name: MapKeyValue.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 20时43分08秒
 ************************************************************************/
import java.util.*;
import static java.lang.System.out;

public class MapKeyValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");
        out.println("显示键");
        map.keySet().forEach(key -> out.println(key));
        out.println("显示值");
        map.values().forEach(key -> out.println(key));
    }
}

