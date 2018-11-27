/*************************************************************************
	> File Name: Sort4.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 20时00分14秒
 ************************************************************************/
import java.util.*;
import static java.util.Comparator.*;

public class Sort4 {
    public static void main(String[] args) {
        List words = Arrays.asList("B","X","A","M",null,"F","W","O",null);
        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}
