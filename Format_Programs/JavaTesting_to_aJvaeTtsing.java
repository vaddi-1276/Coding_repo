package Format_Programs;

public class JavaTesting_to_aJvaeTtsing {
    public static void main(String[] args) {

        String str = "JavaTesting";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 4 || i == 6) {
                result = result + str.charAt(i + 1) + str.charAt(i);
                i++;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
