import java.util.Scanner;

public class M14_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("文字列を二つ入力してください。");
        System.out.print("一つ目の文字列を入力：");
        String str = stdIn.next();
        System.out.print("二つ目の文字列を入力：");
        String str1 = stdIn.next();

        if (str.equals(str1)) {
            System.out.println("同じ文字列です");
        } else {
            System.out.println("違う文字列です");
        }

        stdIn.close();
    }
}
