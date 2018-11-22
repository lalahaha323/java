/*************************************************************************
	> File Name: Average.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 13时32分20秒
 ************************************************************************/

public class Average {
    public static void main(String[] args) {
        long sum = 0;
        for(String arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("平均：" + (float) sum / args.length);
    }
}
