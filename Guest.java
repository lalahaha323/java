/*************************************************************************
	> File Name: Guest.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 19时20分05秒
 ************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

class ArrayList {
    private Object[] list;
    private int next;

    public ArrayList(int capacity) {
        list = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Object o) {
        if(next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }

    public Object get(int index) {
        return list[index];
    }

    public int size() {
        return next;
    }
}

public class Guest {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        collectNameTo(names);
        out.println("访客名单: ");
        printUpperCase(names);
    }

    static void collectNameTo(ArrayList names) {
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

    static void printUpperCase(ArrayList names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }
    }
}

