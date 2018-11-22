/*************************************************************************
	> File Name: MathTool.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 15时19分40秒
 ************************************************************************/

public class MathTool {
    public static int sum(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = sum(1,1,1,1,1);
        System.out.printf("%d",sum);
    }
}
