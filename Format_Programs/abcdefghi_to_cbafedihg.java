package Format_Programs;

public class abcdefghi_to_cbafedihg {
    public static void main(String[] args) {
        String str = "abcdefghi";
        String result = "";
        for (int i = 0; i < str.length(); i += 3) {
            int end = Math.min(i + 2, str.length() - 1);

            for (int j = end; j >= i; j--) {
                result = result + str.charAt(j);
            }
        }
        System.out.println(result);
    }
}
