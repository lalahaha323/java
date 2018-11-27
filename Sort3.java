/*************************************************************************
	> File Name: Sort3.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 19时50分18秒
 ************************************************************************/
import java.util.*;
class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}
public class Sort3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("B","X","A","M","F","W","O");
        Collections.sort(words,new StringComparator());
        System.out.println(words);
    }
}

