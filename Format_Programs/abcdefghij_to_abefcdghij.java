package Format_Programs;

public class abcdefghij_to_abefcdghij {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";

        for (int i = 0; i < 2; i++) {
            result = result + str.charAt(i);
        }

        for (int i = 4; i <= 5; i++) {
            result = result + str.charAt(i);
        }

        for (int i = 2; i <= 3; i++) {
            result = result + str.charAt(i);
        }

        for (int i = 6; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
