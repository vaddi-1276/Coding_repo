package Format_Programs;

public class abcdefgh_to_acbdegfh {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 3 || i == 4 || i == 7) {
                result = result + str.charAt(i);
            } else if (i == 1 || i == 5) {
                result = result + str.charAt(i + 1);
            } else {
                result = result + str.charAt(i - 1);
            }
        }
        System.out.println(result);
    }
}
