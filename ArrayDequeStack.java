/*************************************************************************
	> File Name: ArrayDequeStack.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 15时46分02秒
 ************************************************************************/
import java.util.*;
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        stack.push("疯狂Java讲义");
        stack.push("轻量级Java EE企业应用实战");
        stack.push("疯狂Android讲义");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
