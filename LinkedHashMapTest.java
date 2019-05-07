/*************************************************************************
	> File Name: LinkedHashMapTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 17时25分55秒
 ************************************************************************/
import java.util.*;
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文", 90);
        scores.put("数学", 82);
        scores.put("英语", 76);
        scores.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}

