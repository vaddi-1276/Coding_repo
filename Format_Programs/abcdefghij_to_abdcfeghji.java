package Format_Programs;

public class abcdefghij_to_abdcfeghji {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 2 || i == 4 || i == 8) {
                result = result + str.charAt(i + 1) + str.charAt(i);
                i++;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
