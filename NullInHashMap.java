/*************************************************************************
	> File Name: NullInHashMap.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时01分11秒
 ************************************************************************/
import java.util.*;
public class NullInHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null, null);
        hm.put(null, null);
        hm.put("a", null);
        System.out.println(hm);
    }
}

