public class M14_6 {
    public static void main(String[] args) {
        String str = "東京都神田神保町";
        String str1 = "千代田区";

        String str2 = str.substring(0, 3);

        String str3 = str.substring(3);

        System.out.println(str2 + str1 + str3);
}
}
