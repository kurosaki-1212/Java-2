import java.util.Scanner;;

public class M14_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        System.out.println("入力された文字数は" + str.length() + "です");

        stdIn.close();
    }
}

