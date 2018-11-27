/*************************************************************************
	> File Name: ForEach2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 19时13分54秒
 ************************************************************************/
import java.util.*;
import static java.lang.System.out;
public class ForEach2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Justin","Monica","Irene");
        names.forEach(name -> out.println(name));
        new HashSet(names).forEach(name -> out.println(name));
        new ArrayDeque(names).forEach(name -> out.println(name));
    }
}

