import java.util.Scanner;

public class M15_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数１＝ ");
        int x = stdIn.nextInt();

        System.out.print("整数２＝ ");
        int y = stdIn.nextInt();

        try {
            System.out.println(x + "/" + y + "=" + x / y);
        } catch (ArithmeticException e) {
            System.out.println("0による割り算です！");
        } finally {
            System.out.println("処理終了");
        }

        stdIn.close();
    }
}
