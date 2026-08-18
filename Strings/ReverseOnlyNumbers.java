package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java123Selenium456

// Output:
// Java654Selenium321

class ReverseNumbersOnlyUsingForLoop {
    public static void ReverseNumbersOnlyUsingForLoopMethods(String str) {

        String onlynumbersString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                onlynumbersString = onlynumbersString + ch;
            }
        }

        String reverse_onlynumbersString = "";
        for (int i = onlynumbersString.length() - 1; i >= 0; i--) {
            char ch = onlynumbersString.charAt(i);
            reverse_onlynumbersString = reverse_onlynumbersString + ch;
        }

        String result = "";
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                result = result + reverse_onlynumbersString.charAt(index++);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseNumberOnlyUsingArrayListCollectionsReverse {

    public static void ReverseNumberOnlyUsingArrayListCollectionsReverseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyNumbersString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= '0' && ch <= '9') {

                onlyNumbersString.add(ch);
            }
        }
        Collections.reverse(onlyNumbersString);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= '0' && ch <= '9') {
                result.append(onlyNumbersString.get(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyNumbers {
    public static void main(String[] args) {
        ReverseNumbersOnlyUsingForLoop.ReverseNumbersOnlyUsingForLoopMethods("Java123Selenium456");
        ReverseNumberOnlyUsingArrayListCollectionsReverse
                .ReverseNumberOnlyUsingArrayListCollectionsReverseMethods("Java123Selenium456");
    }
}
