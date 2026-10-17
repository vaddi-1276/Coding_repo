package Format_Programs;

public class abcdefgh_to_adcbefgh {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 1) {
                result = result + str.charAt(i + 2);
            } else if (i == 3) {
                result = result + str.charAt(i - 2);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
