package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// JavaSelenium

// Output:
// JmuineleSava

class ReverseOnlyLowercaseLettersUsingForLoop {
    public static void ReverseOnlyLowercaseLettersUsingForLoopMethods(String str) {

        String onlylowercasevalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                onlylowercasevalue = onlylowercasevalue + ch;
            }
        }
        String reverseonlylowercasevalue = "";
        for (int i = onlylowercasevalue.length() - 1; i >= 0; i--) {
            reverseonlylowercasevalue = reverseonlylowercasevalue + onlylowercasevalue.charAt(i);
        }

        int index = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + reverseonlylowercasevalue.charAt(index++);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverse {
    public static void ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlylowercasevalue = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch >= 'a' && ch <= 'z') {
                onlylowercasevalue.add(ch);
            }
        }
        Collections.reverse(onlylowercasevalue);
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append(onlylowercasevalue.get(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyLowercaseLetters {
    public static void main(String[] args) {
        ReverseOnlyLowercaseLettersUsingForLoop.ReverseOnlyLowercaseLettersUsingForLoopMethods("Java Selenium");
        ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverse
                .ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverseMethods("Java Selenium");
    }
}
