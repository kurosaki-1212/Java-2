import java.util.Scanner;

public class M14_13 {
   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);

       System.out.print("住所を住所を入力してください：");
       String str = stdIn.next();

       int beginIdx = str.indexOf("県");
       int endIdx = str.indexOf("市");
       String result = str.substring(beginIdx + 1, endIdx + 1);
       System.out.println(result);

       stdIn.close();
   } 
}
