package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdefghi
// Start = 2, End = 6

// Output:
// abfedcghi

class ReverseRangeUsingLoop {
    public static void reverseUsingLoop(String str) {

        int start = 2;
        int end = 6;
        String result = "";
        for (int i = 0; i < start; i++) {
            result = result + str.charAt(i);
        }

        for (int i = end - 1; i >= start; i--) {
            result = result + str.charAt(i);
        }

        for (int i = end; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}

class ReverseRangeUsingSubstring {
    public static void reverseUsingSubstring(String str) {

        String result = "";
        int start = 2;
        int end = 6;
        String firstpart = str.substring(0, start);
        String reverseString = new StringBuilder(str.substring(start, end)).reverse().toString();
        String endpart = str.substring(end);

        result = firstpart + reverseString + endpart;
        System.out.println(result);

    }
}

class ReverseRangeUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        int start = 2;
        int end = 6;

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> reversepositionString = new ArrayList<>();
        for (int i = start; i < end; i++) {
            reversepositionString.add(list.get(i));
        }

        Collections.reverse(reversepositionString);
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < start; i++) {
            result.append(list.get(i));
        }

        for (int i = start; i < end; i++) {
            result.append(reversepositionString.get(index++));
        }

        for (int i = end; i < list.size(); i++) {
            result.append(list.get(i));
        }

        System.out.println(result);
    }
}

public class ReverseBetweenPositions {
    public static void main(String[] args) {
        ReverseRangeUsingLoop.reverseUsingLoop("abcdefghi");
        ReverseRangeUsingSubstring.reverseUsingSubstring("abcdefghi");
        ReverseRangeUsingArrayList.reverseUsingArrayList("abcdefghi");
    }
}
