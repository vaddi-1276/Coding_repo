package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// FeDcBa

class ReverseAndToggleUsingLoop {
    public static void transformUsingLoop(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        String finalvalue = "";
        for (int i = 0; i < reverseString.length(); i++) {
            char ch = reverseString.charAt(i);

            if (i % 2 == 0) {
                finalvalue = finalvalue + Character.toUpperCase(ch);
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

class ReverseAndToggleUsingArrayList {
    public static void transformUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(result);
    }
}

class ReverseAndToggleUsingASCII {
    public static void transformUsingASCII(String str) {

        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        String finalvalue = "";
        for (int i = 0; i < reverseString.length(); i++) {
            char ch = reverseString.charAt(i);

            if (i % 2 == 0) {
                finalvalue = finalvalue + (char) (ch - 32);
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

public class ReverseAndToggleCase {
    public static void main(String[] args) {
        ReverseAndToggleUsingLoop.transformUsingLoop("abcdef");
        ReverseAndToggleUsingArrayList.transformUsingArrayList("defghi");
        ReverseAndToggleUsingASCII.transformUsingASCII("abcdef");
    }
}
