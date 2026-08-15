package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// ebcdaf

class AlternateCharacterReversalUsingLoop {
    public static void reverseUsingLoop(String str) {
        String even_position = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                even_position = even_position + ch;
            }
        }
        String reverse_even_position = "";
        for (int i = even_position.length() - 1; i >= 0; i--) {
            reverse_even_position = reverse_even_position + even_position.charAt(i);
        }
        int index = 0;
        String finalString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                finalString = finalString + reverse_even_position.charAt(index++);
            } else {
                finalString = finalString + str.charAt(i);
            }
        }
        System.out.println("Using Nested For Loop " + finalString);
    }
}

class AlternateCharacterReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        String even_position_value = "";
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                even_position_value = even_position_value + list.get(i);
            }
        }
        String reverse_even_position_value = "";
        for (int j = even_position_value.length() - 1; j >= 0; j--) {
            reverse_even_position_value = reverse_even_position_value + even_position_value.charAt(j);
        }
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.append(reverse_even_position_value.charAt(index++));
            } else {
                result.append(list.get(i));
            }
        }
        System.out.println("Using ArrayList " + result);
    }
}

class AlternateCharacterReversalUsingCollections {
    public static void reverseUsingCollections(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> even_positionString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                even_positionString.add(list.get(i));
            }
        }
        Collections.reverse(even_positionString);
        System.out.println(even_positionString);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                result.append(even_positionString.get(index++));
            } else {
                result.append(list.get(i));
            }
        }
        System.out.println(result);
    }
}

public class AlternateCharacterReverser {
    public static void main(String[] args) {
        AlternateCharacterReversalUsingLoop.reverseUsingLoop("abcdef");
        AlternateCharacterReversalUsingArrayList.reverseUsingArrayList("abcdef");
        AlternateCharacterReversalUsingCollections.reverseUsingCollections("abcdef");
    }
}
