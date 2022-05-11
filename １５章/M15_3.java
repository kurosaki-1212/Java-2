import java.util.Arrays;
import java.util.Scanner;

public class M15_3 {
    public static void main(String[] args) {
        
        try {
            int[] num = {1, 2, 3, 4, 5};
            Scanner stdIn = new Scanner(System.in);
            System.out.println("num = " + Arrays.toString(num));
            System.out.print("インデックス番号 = ");
            int x = stdIn.nextInt(); 
            System.out.println("num[" + x + "] = " + num[x]);

            stdIn.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("領域参照外です");
        } finally {
            System.out.println("終了");
        }
    }
}
