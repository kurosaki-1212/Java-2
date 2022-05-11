import java.util.Scanner;

public class M14_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        System.out.println(str);

        stdIn.close();
    }
}
