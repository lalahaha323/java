/*************************************************************************
	> File Name: FinallyFlowTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时07分45秒
 ************************************************************************/

public class FinallyFlowTest{
    public static void main(String[] args) throws Exception{
        boolean a = test();
        System.out.println(a);
    }
    public static boolean test() {
        try {
            return true;
        }
        finally {
            System.out.println("jaja");
            return false;
        }
    }
}
