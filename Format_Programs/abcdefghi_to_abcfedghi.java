package Format_Programs;

public class abcdefghi_to_abcfedghi {
    public static void main(String[] args) {
        String str = "abcdefghi";
        String result = "";
        int d_position = str.indexOf('d');
        int f_position = str.indexOf('f');

        for (int i = 0; i < d_position; i++) {
            result = result + str.charAt(i);
        }

        for (int i = f_position; i >= d_position; i--) {
            result = result + str.charAt(i);
        }

        for (int i = f_position + 1; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
