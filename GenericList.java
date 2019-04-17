/*************************************************************************
	> File Name: GenericList.java
	> Author: 
	> Mail: 
	> Created Time: 2019年04月16日 星期二 22时37分16秒
 ************************************************************************/
import java.util.*;
public class GenericList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("lala");
        strList.add("nini");
        strList.forEach(str -> System.out.println(str.length()));
    }
}
