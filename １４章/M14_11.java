import java.util.Scanner;

public class M14_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("住所を入力して下さい");
        String str = stdIn.next();

        if (str.contains("市")) {
            System.out.println("市");
        } else if (str.contains("郡")) {
            System.out.println("郡");
        } else {
            System.out.println("東京23区");
        }

        stdIn.close();
    }
}
