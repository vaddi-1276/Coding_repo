package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java Selenium

// Output:
// Sava Jelenium

class ReverseOnlyUppercaseLettersUsingForLoop {
    public static void ReverseOnlyLowercaseLettersUsingForLoopMethods(String str) {

        String upperCaseString = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCaseString = upperCaseString + ch;
            }
        }
        String reverse_upperCaseString = "";
        for (int i = upperCaseString.length() - 1; i >= 0; i--) {
            reverse_upperCaseString = reverse_upperCaseString + upperCaseString.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + reverse_upperCaseString.charAt(index++);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverse {
    public static void ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> upperCaseString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCaseString.add(ch);
            }
        }

        Collections.reverse(upperCaseString);
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append(upperCaseString.get(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyUppercaseLetters {
    public static void main(String[] args) {
        ReverseOnlyUppercaseLettersUsingForLoop.ReverseOnlyLowercaseLettersUsingForLoopMethods("Java Selenium");
        ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverse
                .ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverseMethods("Java Selenium");
    }
}
