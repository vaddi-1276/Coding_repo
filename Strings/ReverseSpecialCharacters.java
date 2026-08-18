package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java@#123$%

// Output:
// Java%$123#@

class ReverseSpecialCharactersUsingLoop {
    public static void reverseUsingLoop(String str) {

        String specialCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                continue;
            }

            else {
                specialCharacters = specialCharacters + ch;
            }
        }
        String reverse_specialCharacters = "";
        for (int i = specialCharacters.length() - 1; i >= 0; i--) {
            char ch = specialCharacters.charAt(i);
            reverse_specialCharacters = reverse_specialCharacters + ch;
        }
        int index = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                result = result + ch;
            } else {
                result = result + reverse_specialCharacters.charAt(index++);
            }

        }
        System.out.println(result);
    }
}

class ReverseSpecialCharactersUsingArrayList {

    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            list.add(str.charAt(i));
        }

        ArrayList<Character> specialcharacters = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (!(Character.isLetterOrDigit(ch))) {
                specialcharacters.add(ch);
            }
        }
        Collections.reverse(specialcharacters);

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (!(Character.isLetterOrDigit(ch))) {
                result.append(specialcharacters.get(index++));
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
