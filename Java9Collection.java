/*************************************************************************
	> File Name: Java9Collection.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 23时22分59秒
 ************************************************************************/
import java.util.*;
public class Java9Collection {
    public static void main(String[] args) {
        Set set  = Set.of("Java", "Kotlin", "Go", "Swift");
        System.out.println(set);
        //不可编辑和，下面的代码导致运行时错误
        //set.add("lala");
        List list = List.of(34, -25, 67, 231);
        System.out.println(list);
        //下面代码错误
        //list.remove(1);
        Map map = Map.of("lala", 89, "数学", 82);
        System.out.println(map);
        //下面错误
        //map.remove("lala");
        Map map2 = Map.ofEntries(Map.entry("lala", 89), Map.entry("数学", 82));
        System.out.println(map2);
    }
}

