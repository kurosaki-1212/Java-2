import java.util.InputMismatchException;
import java.util.Scanner;

public class M15_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
        System.out.print("整数を入力＝");
        int num = stdIn.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + "は偶数");
            } else if (num % 2 == 1) {
                System.out.println(num + "は奇数");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        }

        stdIn.close();
    }
}
