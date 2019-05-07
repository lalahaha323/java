/*************************************************************************
	> File Name: FixedSizeList.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时27分45秒
 ************************************************************************/
import java.util.*;
public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("lala", "nini");
        System.out.println(fixedList.getClass());
        fixedList.forEach(System.out::println);
        
    }
}
