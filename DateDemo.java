/*************************************************************************
	> File Name: DateDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 22时52分55秒
 ************************************************************************/
import java.util.*;
import static java.lang.System.*;
public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date(currentTimeMillis());
        Date date2 = new Date();

        out.println(date1.getTime());
        out.println(date2.getTime());
    }
}

