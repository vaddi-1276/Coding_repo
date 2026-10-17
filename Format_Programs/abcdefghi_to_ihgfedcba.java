package Format_Programs;

public class abcdefghi_to_ihgfedcba {
    public static void main(String[] args) {
        String str = "abcdefghi";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
