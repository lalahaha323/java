/*************************************************************************
	> File Name: OneTo100.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 13时38分41秒
 ************************************************************************/

public class OneTo100 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <100; i++) {
            builder.append(i).append('+');
        }
        System.out.println(builder.append(100).toString());
    }
}
