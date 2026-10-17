package Format_Programs;

// Input:  abcdefg
// Output: acbdfeg

public class abcdefg_to_acbdfeg {
    public static void main(String[] args) {
        String str = "abcdefg";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 3 || i == 6) {
                result = result + str.charAt(i);
            } else if (i == 1 || i == 4) {
                result = result + str.charAt(i + 1);
            } else {
                result = result + str.charAt(i - 1);
            }
        }
        System.out.println(result);
    }
}