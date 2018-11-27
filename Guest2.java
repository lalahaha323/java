/*************************************************************************
	> File Name: Guest2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 16时30分24秒
 ************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import static java.lang.System.out;
public class Guest2 {
    public static void main(String[] args) {
        List names = new ArrayList();
        collectNameTo(names);
        out.println("访客名单:");
        printUpperCase(names);
    }
    static void collectNameTo(List names) {
        Scanner console = new Scanner(System.in);
        while(true) {
            out.print("访客名称：");
            String name = console.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(List names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }
    }
}
