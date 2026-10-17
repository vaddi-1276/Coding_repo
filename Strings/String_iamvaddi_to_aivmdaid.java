package Strings;

public class String_iamvaddi_to_aivmdaid {
    public static void main(String[] args) {
        String str = "iamvaddi";
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
