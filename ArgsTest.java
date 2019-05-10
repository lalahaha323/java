/*************************************************************************
	> File Name: ArgsTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月10日 星期五 16时56分35秒
 ************************************************************************/
public class ArgsTest {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
