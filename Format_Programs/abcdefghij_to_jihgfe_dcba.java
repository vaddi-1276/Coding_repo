package Format_Programs;

public class abcdefghij_to_jihgfe_dcba {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";
        String finalString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            if (ch == 'e') {
                finalString = finalString + "e ";
            } else {
                finalString = finalString + ch;
            }
        }
        System.out.println(finalString);
    }
}
