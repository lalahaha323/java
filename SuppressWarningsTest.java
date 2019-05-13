/*************************************************************************
	> File Name: SuppressWarningsTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 15时19分31秒
 ************************************************************************/
//关闭整个类里的编译器警告
import java.util.*;
@SuppressWarnings(value="unchecked")
public class SuppressWarningsTest {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
    }
}
