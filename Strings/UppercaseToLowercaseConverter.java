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
            result = result + Character.toLowerCase(ch);
        }
        System.out.println(result);
    }
}

class LowercaseUsingASCII {
    public static void convertUsingASCII(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        System.out.println(result);
    }
}

class LowercaseUsingArrayList {
    public static void convertUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        System.out.println(list);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        System.out.println(result);
    }
}

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        LowercaseUsingCharacterAPI.convertUsingCharacterAPI("JAVA SELENIUM");
        LowercaseUsingASCII.convertUsingASCII("JAVA SELENIUM");
        LowercaseUsingArrayList.convertUsingArrayList("PYTHON APPIUM");
    }
}
