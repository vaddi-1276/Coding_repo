package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java123Selenium456

// Output:
// Java654Selenium321

class ReverseNumbersOnlyUsingForLoop {
    public static void ReverseNumbersOnlyUsingForLoopMethods(String str) {

        String onlydigitvalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                onlydigitvalue = onlydigitvalue + str.charAt(i);
            }
        }
        String reverseonlydigitvalue = "";
        for (int i = onlydigitvalue.length() - 1; i >= 0; i--) {
            reverseonlydigitvalue = reverseonlydigitvalue + onlydigitvalue.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                result = result + reverseonlydigitvalue.charAt(index++);
            }

            else {
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

        ArrayList<Character> onlydigitvalue = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch >= '0' && ch <= '9') {
                onlydigitvalue.add(ch);
            }
        }
        Collections.reverse(onlydigitvalue);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= '0' && ch <= '9') {
                result.append(onlydigitvalue.get(index++));
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
