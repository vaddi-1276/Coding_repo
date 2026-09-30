package Arrays_and_Strings;

// Input

// String 1: automation
// String 2: application

// Output

// a t i o n

public class FindCommonCharactersBetweenTwoStrings {
    public static void main(String[] args) {

        String str1 = "automation";
        String str2 = "application";

        for (int i = 0; i < str1.length(); i++) {
            boolean commonbetweentwostrings = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    commonbetweentwostrings = true;
                    break;
                }
            }

            if (commonbetweentwostrings) {
                boolean isalreadyPrint = false;

                for (int k = 0; k < i; k++) {
                    if (str1.charAt(k) == str1.charAt(i)) {
                        isalreadyPrint = true;
                        break;
                    }
                }
                if (isalreadyPrint == false) {
                    System.out.println(str1.charAt(i));
                }
            }
        }
    }
}
