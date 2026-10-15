package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java@#123$%

// Output:
// Java%$123#@

class ReverseSpecialCharactersUsingLoop {
    public static void reverseUsingLoop(String str) {

        String onlyspecialcharactersString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(Character.isLetterOrDigit(ch))) {
                onlyspecialcharactersString = onlyspecialcharactersString + ch;
            }
        }
        String reverseonlyspecialcharactersString = "";

        for (int i = onlyspecialcharactersString.length() - 1; i >= 0; i--) {
            reverseonlyspecialcharactersString = reverseonlyspecialcharactersString
                    + onlyspecialcharactersString.charAt(i);
        }
        int index = 0;
        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(Character.isLetterOrDigit(ch))) {
                resultString = resultString + reverseonlyspecialcharactersString.charAt(index++);
            }

            else {
                resultString = resultString + ch;
            }
        }
        System.out.println(resultString);
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
        // ReverseSpecialCharactersUsingArrayList.reverseUsingArrayList("Java@#123$%");
    }
}
