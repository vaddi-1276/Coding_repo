package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java@#123$%

// Output:
// Java%$123#@

class ReverseSpecialCharactersUsingLoop {
    public static void reverseUsingLoop(String str) {

        String onlyStringvalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
                onlyStringvalue = onlyStringvalue + ch;
            }
        }

        String reverseonlyStringvalue = "";
        for (int i = onlyStringvalue.length() - 1; i >= 0; i--) {
            reverseonlyStringvalue = reverseonlyStringvalue + onlyStringvalue.charAt(i);
        }

        int index = 0;
        String finalvalue = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
                finalvalue = finalvalue + reverseonlyStringvalue.charAt(index++);
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);

    }
}

class ReverseSpecialCharactersUsingArrayList {

    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyspecialCharacters = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (!(Character.isLetterOrDigit(ch))) {
                onlyspecialCharacters.add(ch);
            }
        }

        Collections.reverse(onlyspecialCharacters);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (!(Character.isLetterOrDigit(ch))) {
                result.append(onlyspecialCharacters.get(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseSpecialCharacters {
    public static void main(String[] args) {
        ReverseSpecialCharactersUsingLoop.reverseUsingLoop("Java@#123$%");
        ReverseSpecialCharactersUsingArrayList.reverseUsingArrayList("Java@#123$%");
    }
}
