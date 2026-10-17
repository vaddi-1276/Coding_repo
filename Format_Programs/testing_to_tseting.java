package Format_Programs;

public class testing_to_tseting {
    public static void main(String[] args) {
        String str = "testing";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 1) {
                result = result + str.charAt(i + 1);
            } else if (i == 2) {
                result = result + str.charAt(i - 1);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
