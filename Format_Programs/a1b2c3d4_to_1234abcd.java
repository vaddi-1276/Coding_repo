package Format_Programs;

public class a1b2c3d4_to_1234abcd {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                result = result + ch;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
