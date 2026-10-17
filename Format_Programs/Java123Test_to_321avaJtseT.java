package Format_Programs;

public class Java123Test_to_321avaJtseT {
    public static void main(String[] args) {
        String str = "Java123Test";
        String result = "";
        String digits = "";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits = ch + digits;
            }
        }
        result = result + digits;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                temp = ch + temp;
            } else {
                result = result + temp;
                temp = "";
            }
        }
        result = result + temp;
        System.out.println(result);
    }
}
