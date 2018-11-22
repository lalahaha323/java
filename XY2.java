/*************************************************************************
	> File Name: XY2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 00时31分00秒
 ************************************************************************/

public class XY2 {
    public static void main(String[] args) {
        int[][] cords = {
            {1,2,3},
            {4,4,6}
        };
        for(int[] row : cords) {
            for(int value : row) {
                System.out.printf("%2d", value);
            }
        }
        System.out.println();
    }
}
