/*************************************************************************
	> File Name: MapTest2.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 16时54分43秒
 ************************************************************************/
import java.util.*;
public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂ios讲义", 99);
        map.put("疯狂Ajax讲义", 79);
        map.replace("疯狂XML敬意", 66);
        System.out.println(map);
        map.merge("疯狂ios讲义", 10, (oldVal, param) -> (Integer)oldVal + (Integer)param);
        System.out.println(map);
        map.computeIfAbsent("Java", (key) -> ((String)key).length());
        System.out.println(map);
        map.computeIfPresent("Java", (key, value) -> (Integer)value * (Integer)value);
        System.out.println(map);
    }
}

