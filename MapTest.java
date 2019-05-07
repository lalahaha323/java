/*************************************************************************
	> File Name: MapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 16时07分13秒
 ************************************************************************/
import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂ios讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级Java EE企业应用", 99);
        System.out.println(map.put("疯狂ios讲义", 99));
        System.out.println(map);
        System.out.println("是否包含值为 疯狂ios讲义 key： "+ map.containsKey("疯狂ios讲义"));
        System.out.println("是否包含值为 99 value： " + map.containsValue(99));
        for(Object key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        map.remove("疯狂Ajax讲义");
        System.out.println(map);
    }
}

