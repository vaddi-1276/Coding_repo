package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef
// N = 3

// Output:
// cbadef

class ReversePrefixUsingLoop {

    public static void reverseUsingLoop(String str) {

        int position = 3;
        String firsthalf = "";
        for (int i = position - 1; i >= 0; i--) {
            firsthalf = firsthalf + str.charAt(i);
        }
        String result = firsthalf;
        for (int i = position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}

class ReversePrefixUsingSubstring {
    public static void reverseUsingSubstring(String str) {

        int position = 3;
        String result = "";

        result = result + new StringBuilder(str.substring(0, position)).reverse();
        result = result + str.substring(position);

        System.out.println(result);
    }
}

class ReversePrefixUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        int position = 3;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> reversebyposition = new ArrayList<>();
        for (int i = 0; i < position; i++) {
            reversebyposition.add(str.charAt(i));
        }

        Collections.reverse(reversebyposition);

        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < position; i++) {
            result.append(reversebyposition.get(index++));
        }

        for (int i = position; i < list.size(); i++) {
            result.append(list.get(i));
        }

        System.out.println(result);
    }
}

public class ReversePrefix {
    public static void main(String[] args) {
        ReversePrefixUsingLoop.reverseUsingLoop("abcdef");
        ReversePrefixUsingSubstring.reverseUsingSubstring("12345678");
        ReversePrefixUsingArrayList.reverseUsingArrayList("abcdef");
    }
}
