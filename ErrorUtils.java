/*************************************************************************
	> File Name: ErrorUtils.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 16时19分32秒
 ************************************************************************/
import java.util.*;
public class ErrorUtils {
    public static void faultyMethod(List<String>... listStrArray) {
        //Java语言不允许创建泛型数组，因此listArray只能被当成List[]处理
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(new Random().nextInt(100));;
        listArray[0] = myList;
        String s = listStrArray[0].get(0);
    }
}
