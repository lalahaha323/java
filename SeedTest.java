/*************************************************************************
	> File Name: SeedTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月11日 星期六 16时19分16秒
 ************************************************************************/
import java.util.*;
public class SeedTest {
    public static void main(String[] args) {
        Random r1 = new Random(50);
        System.out.println("第一个种子为50的Random对象");
        System.out.println("r1.nextBoolean():\t" + r1.nextBoolean());
        System.out.println("r1.nextInt():\t\t" + r1.nextInt());
        System.out.println("r1.nextDouble():\t" + r1.nextDouble());
        System.out.println("r1.nextGaussian:\t" + r1.nextGaussian());
        System.out.println("--------------------------");
        Random r2 = new Random(50);
        System.out.println("第二个种子为50的Random对象");
        System.out.println("r2.nextBoolean():\t" + r2.nextBoolean());
        System.out.println("r2.nextGaussian():\t" + r2.nextGaussian());
        System.out.println("r2.nextInt():\t\t" + r2.nextInt());
        System.out.println("r2.nextDouble():\t" + r2.nextDouble());
       // System.out.println("r2.nextGaussian:\t" + r2.nextGaussian());
        System.out.println("--------------------------");
        Random r3 = new Random(100);
        System.out.println("种子为100的random对象");
        System.out.println("r3.nextBoolean():\t" + r3.nextBoolean());
        System.out.println("r3.nextInt():\t\t" + r3.nextInt());
        System.out.println("r3.nextDouble():\t" + r3.nextDouble());
        System.out.println("r3.nextGaussian:\t" + r3.nextGaussian());
       /*
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int val = rand.nextInt(4, 20);
        int val2 = rand.nextDouble(2.0, 10.0);
        System.out.println(val);
        System.out.println(val2);*/
    }
}
