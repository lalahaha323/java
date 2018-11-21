/*************************************************************************
	> File Name: TestArrays.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 15时41分02秒
 ************************************************************************/

class TestArrays {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        int ref;
        int  y = 0;
        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
