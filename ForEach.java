/*************************************************************************
	> File Name: ForEach.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 19时04分20秒
 ************************************************************************/
import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        List names = Arrays.asList("Justin", "Monica", "Irene");
        forEach(names);
        forEach(new HashSet(names));
        forEach(new ArrayDeque(names));
    }
    static void forEach(Iterable iterable) {
        for(Object o : iterable) {
            System.out.println(o);
        }
    }
}

