/*************************************************************************
	> File Name: DecimalDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 22时55分34秒
 ************************************************************************/
import java.math.BigDecimal;
public class DecimalDemo {
    public static void main(String[] args) {
        BigDecimal operand1 = new BigDecimal("1.0");
        BigDecimal operand2 = new BigDecimal("0.8");
        BigDecimal result = operand1.subtract(operand2);
        System.out.println(result);
    }
}

