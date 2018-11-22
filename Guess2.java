/*************************************************************************
	> File Name: Guess2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 19时54分01秒
 ************************************************************************/
import java.util.Scanner;
abstract class GuessGame {
    public void go() {
        int number = (int) (Math.random() * 10);
        int guess;
        do {
            print("输入数字: ");
            guess = nextInt();
        } while(guess != number);
        println("猜中了！");
    }

    public void println(String text) {
        print(text + "\n");
    }

    public abstract void print(String text);
    public abstract int nextInt();
}

class ConsoleGame extends GuessGame {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void println(String text) {
        System.out.println(text);
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }
}
public class Guess2 {
    public static void main(String[] args) {
        GuessGame game = new ConsoleGame();
        game.go();
    }
}
