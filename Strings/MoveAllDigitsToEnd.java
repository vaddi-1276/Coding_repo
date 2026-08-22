package Strings;

import java.util.ArrayList;

// Input:
// Java123Selenium456

// Output:
// JavaSelenium123456

class UsingForLoopMoveAllDigitsToEnd {
    public static void UsingForLoopMoveAllDigitsToEndMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                result = result + ch;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListMoveAllDigitsToEnd {
    public static void UsingArrayListMoveAllDigitsToEndMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class MoveAllDigitsToEnd {
    public static void main(String[] args) {
        UsingForLoopMoveAllDigitsToEnd.UsingForLoopMoveAllDigitsToEndMethods("Java123Selenium456");
        UsingArrayListMoveAllDigitsToEnd.UsingArrayListMoveAllDigitsToEndMethods("Java123Selenium456");
    }
}
