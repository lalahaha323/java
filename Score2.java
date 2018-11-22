/*************************************************************************
	> File Name: Score2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 00时34分15秒
 ************************************************************************/
import java.util.Arrays;
public class Score2 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        for(int score : scores) {
            System.out.printf("%2d",score);
        }
        System.out.println();
        Arrays.fill(scores,60);
        for(int score : scores) {
            System.out.printf("%3d",score);
        }
    }
}
