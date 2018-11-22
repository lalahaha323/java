/*************************************************************************
	> File Name: IntegerDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 00时11分45秒
 ************************************************************************/

public class IntegerDemo {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;
        Integer wrapper1 = new Integer(data1);
        Integer wrapper2 = new Integer(data2);
        System.out.println(data1 / 3);
        System.out.println(wrapper1.doubleValue() / 3);
        System.out.println(wrapper2.compareTo(wrapper2));
    }
}

