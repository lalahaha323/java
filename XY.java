/*************************************************************************
	> File Name: XY.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 00时25分22秒
 ************************************************************************/

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for(int x =0; x < cords.length; x++) {
            for(int y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
}
