/*************************************************************************
	> File Name: ShalloCopy2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 12时18分00秒
 ************************************************************************/

public class ShalloCopy2 {
    public static void main(String[] args) {
        int[] scores1 = {88,89,74};
        int[] scores2 = new int[scores1.length];
        for(int i = 0; i < scores1.length; i++) {
            scores2[i] = scores1[i];
        }
        scores1[0] = 99;
        for(int score : scores2) {
            System.out.printf("%d ",score);
        }
    }
}

