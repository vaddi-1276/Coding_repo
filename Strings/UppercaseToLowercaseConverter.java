package Strings;

import java.util.ArrayList;

// Input:
// JAVA SELENIUM

// Output:
// java selenium

class LowercaseUsingCharacterAPI {
    public static void convertUsingCharacterAPI(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + Character.toLowerCase(ch);
            } else if (ch == ' ') {
                result = result + " ";
            }
        }

        System.out.println(result);
    }
}

class LowercaseUsingASCII {
    public static void convertUsingASCII(String str) {

        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                resultString = resultString + " ";
            }

            else {
                resultString = resultString + (char) (ch + 32);
            }
        }
        System.out.println(resultString);
    }
}

class LowercaseUsingArrayList {
    public static void convertUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == ' ') {
                result.append(" ");
            }

            else {
                result.append((char) (ch + 32));
            }
        }
        System.out.println(result);
    }
}

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        LowercaseUsingCharacterAPI.convertUsingCharacterAPI("JAVA SELENIUM");
        LowercaseUsingASCII.convertUsingASCII("JAVA SELENIUM");
        // LowercaseUsingArrayList.convertUsingArrayList("PYTHON APPIUM");
    }
}
