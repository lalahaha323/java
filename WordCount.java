/*************************************************************************
	> File Name: WordCount.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 17时07分57秒
 ************************************************************************/
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入英文：");
        Set words = tokenSet(console.nextLine());
        System.out.printf("不重复单字有 %d个：%s%n", words.size(),words);
    }
    static Set tokenSet(String line) {
        String[] tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}

