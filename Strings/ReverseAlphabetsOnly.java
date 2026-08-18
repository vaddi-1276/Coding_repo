package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java123@Selenium

// Output:
//muin123@eleSavaJ

class ReverseAlphabetsUsingLoop {
    public static void reverseUsingLoop(String str) {

        String alphabetsString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                alphabetsString = alphabetsString + ch;
            }
        }
        String reversealphabetsString = "";

        for (int i = alphabetsString.length() - 1; i >= 0; i--) {
            char ch = alphabetsString.charAt(i);
            reversealphabetsString = reversealphabetsString + ch;
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                result = result + reversealphabetsString.charAt(index++);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseAlphabetsUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyAlphabets = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isLetter(ch)) {
                onlyAlphabets.add(ch);
            }
        }
        Collections.reverse(onlyAlphabets);
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (Character.isLetter(ch)) {
                result.append(onlyAlphabets.get(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseAlphabetsOnly {
    public static void main(String[] args) {
        ReverseAlphabetsUsingLoop.reverseUsingLoop("Java123@Selenium");
        ReverseAlphabetsUsingArrayList.reverseUsingArrayList("Java123@Selenium");
    }
}
