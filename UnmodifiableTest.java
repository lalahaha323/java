/*************************************************************************
	> File Name: UnmodifiableTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 23时17分47秒
 ************************************************************************/
import java.util.*;
public class UnmodifiableTest {
    public static void main(String[] args) {
        List unmodifiableList = Collections.emptyList();
        Set unmodifiableSet = Collections.singleton("疯狂Java讲义");
        Map scores = new HashMap();
        scores.put("语文", 80);
        scores.put("Java", 82);
        Map unmodifiableMap = Collections.unmodifiableMap(scores);
        //下面任何一个代码都会引发UnsupportedOperationException异常
        //unmodifiableList.add("测试元素");
        //unmodifiableSet.add("测试元素");
        //unmodifiableMap.put("语文", 90);
    }
}
