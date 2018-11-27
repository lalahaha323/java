/*************************************************************************
	> File Name: Messages.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月27日 星期二 20时04分40秒
 ************************************************************************/
import java.util.*;
import static java.lang.System.out;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("Justin", "Hello!Justin的信息!");
        messages.put("Monica", "给Monica的悄悄话!");
        messages.put("Irene", "Irene的可爱猫喵喵叫!");

        Scanner console = new Scanner(System.in);
        out.print("取得谁的消息：");
        String message = messages.get(console.nextLine());
        out.println(message);
        out.println(messages);
    }
}
