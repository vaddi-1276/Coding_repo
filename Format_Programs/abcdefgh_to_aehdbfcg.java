package Format_Programs;

public class abcdefgh_to_aehdbfcg {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 3 || i == 5) {
                result = result + str.charAt(i);
            } else if (i == 1) {
                result = result + str.charAt(i + 3);
            } else if (i == 2) {
                result = result + str.charAt(i + 5);
            } else if (i == 4) {
                result = result + str.charAt(i - 3);
            } else if (i == 6) {
                result = result + str.charAt(i - 4);
            } else if (i == 7) {
                result = result + str.charAt(i - 1);
            }
        }
        System.out.println(result);
    }
}
