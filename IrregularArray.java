/*************************************************************************
	> File Name: IrregularArray.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 00时38分24秒
 ************************************************************************/

public class IrregularArray {
    public static void main(String[] args) {
        int [][] arr = new int[2][];
        arr[0] = new int[] {1,2,3,4,5};
        arr[1] = new int[] {1,2,3};
        for(int[] row : arr) {
            for(int value : row) {
                System.out.printf("%2d",value);
            }
            System.out.println();
        }
    }
}
