/*************************************************************************
	> File Name: DiamondTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年04月16日 星期二 22时39分44秒
 ************************************************************************/
import java.util.*;

public class DiamondTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("lala");
        books.add("nini");
        books.forEach(ele -> System.out.println(ele.length()));
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("kaka");
        schools.add("mama");
        schoolsInfo.put("sun", schools);
        schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}
