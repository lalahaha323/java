/*************************************************************************
	> File Name: Messages3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 20时15分03秒
 ************************************************************************/
import java.util.*;

public class Messages3 {
    public static void main(String[] args) {
        Map<String, String>messages = new TreeMap<>((s1,s2) -> -s1.compareTo(s2));
        messages.put("Justin","lalala");
        messages.put("Monica","kaka");
        messages.put("Irene","plpl");
        System.out.println(messages);
    }
}
