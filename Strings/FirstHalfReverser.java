package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// cbadef

class FirstHalfReversalUsingLoop {
    public static void reverseUsingLoop(String str) {
        int first_half = str.length() / 2;
        String firsthalfString = "";

        for (int i = 0; i < first_half; i++) {
            firsthalfString = firsthalfString + str.charAt(i);
        }
        String reversefirsthalfString = "";
        for (int i = firsthalfString.length() - 1; i >= 0; i--) {
            reversefirsthalfString = reversefirsthalfString + firsthalfString.charAt(i);
        }
        String finalvalueString = "";
        int index = 0;
        for (int i = 0; i < first_half; i++) {
            finalvalueString = finalvalueString + reversefirsthalfString.charAt(index++);
        }
        for (int i = first_half; i < str.length(); i++) {
            finalvalueString = finalvalueString + str.charAt(i);
        }
        System.out.println(finalvalueString);
    }
}

class FirstHalfReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        int n = str.length() / 2;
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character> even_digit = new ArrayList<>();
        for (int j = 0; j < list.size() / 2; j++) {
            even_digit.add(list.get(j));
        }
        ArrayList<Character> reverse_even_digit = new ArrayList<>();

        for (int j = even_digit.size() - 1; j >= 0; j--) {
            reverse_even_digit.add(even_digit.get(j));
        }

        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < n; i++) {
            result.append(reverse_even_digit.get(index++));
        }
        for (int j = n; j < list.size(); j++) {
            result.append(list.get(j));
        }

        System.out.println(result);
    }
}

class FirstHalfReversalUsingCollections {
    public static void reverseUsingCollections(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int n = list.size() / 2;
        ArrayList<Character> first_half = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            first_half.add(list.get(i));
        }
        Collections.reverse(first_half);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(first_half.get(i));
        }
        for (int j = n; j < list.size(); j++) {
            result.append(list.get(j));
        }
        System.out.println(result);
    }
}

public class FirstHalfReverser {
    public static void main(String[] args) {
        FirstHalfReversalUsingLoop.reverseUsingLoop("abcdef");
        // FirstHalfReversalUsingArrayList.reverseUsingArrayList("defghi");
        // FirstHalfReversalUsingCollections.reverseUsingCollections("ghijlm");
    }
}
