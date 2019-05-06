/*************************************************************************
	> File Name: IntStreamTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月06日 星期一 14时37分31秒
 ************************************************************************/
import java.util.stream.IntStream;
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
            .add(20)
            .add(13)
            .add(-1)
            .add(18)
            .build();
        System.out.println("is所有元素的最大值: " + is.max().getAsInt());
        /*
        System.out.println("is所有元素的最小值：" + is.min().getAsInt());
        System.out.println("is所有元素的总和：" + is.sum());
        System.out.println("is所有元素的总数：" + is.count());
        System.out.println("is所有元素的平均值：" + is.average());
        System.out.println("is所有元素的平方是否都大于20：" + is.allMatch(ele -> ele * ele > 20));
        System.out.println("is是否包含任何元素的平方大于20：" + is.anyMatch(ele -> ele * ele > 20));
*/
        //is.forEach(System.out::println);
    }
}
