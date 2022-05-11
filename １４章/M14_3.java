import java.util.Scanner;

public class M14_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        if (str.length() > 11) {
            str = str.substring(0, 10);
        }

        System.out.println("結果文字列：" + str);

        stdIn.close();
    }
}
