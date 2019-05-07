/*************************************************************************
	> File Name: SynchronizedTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 23时13分54秒
 ************************************************************************/
import java.util.*;
public class SynchronizedTest {
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }
}

