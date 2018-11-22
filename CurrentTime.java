/*************************************************************************
	> File Name: CurrentTime.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 23时12分55秒
 ************************************************************************/
import java.text.*;
import java.util.*;
public class CurrentTime {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat (
                args.length == 0 ? "EE-MM-dd-yyyy" : args[0]
                );
        System.out.println(dateFormat.format(new Date()));
    }
}

