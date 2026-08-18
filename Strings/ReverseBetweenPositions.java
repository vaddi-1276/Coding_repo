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
        String position_string = "";
        String reverse_position_string = "";

        for (int i = 0; i < start; i++) {
            result = result + str.charAt(i);
        }

        for (int i = start; i < end; i++) {
            position_string = position_string + str.charAt(i);
        }

        for (int i = position_string.length() - 1; i >= 0; i--) {
            reverse_position_string = reverse_position_string + position_string.charAt(i);
        }
        result = result + reverse_position_string;

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
        String positionsString = str.substring(start, end);
        String reverse_positionsString = new StringBuilder(positionsString).reverse().toString();
        String secondpart = str.substring(end);

        result = firstpart + reverse_positionsString + secondpart;
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

        ArrayList<Character> position_ArrayList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            position_ArrayList.add(list.get(i));
        }
        Collections.reverse(position_ArrayList);

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < start; i++) {
            result.append(list.get(i));
        }

        for (int i = start; i < end; i++) {
            result.append(position_ArrayList.get(index++));
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
