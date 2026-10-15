package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// abcfed

class SecondHalfReversalUsingLoop {
    public static void reverseUsingLoop(String str) {
        int midposition = str.length() / 2;
        String midpositionString = "";
        for (int i = midposition; i < str.length(); i++) {
            midpositionString = midpositionString + str.charAt(i);
        }
        String reversemidposition = "";
        for (int i = midpositionString.length() - 1; i >= 0; i--) {
            reversemidposition = reversemidposition + midpositionString.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < midposition; i++) {
            result = result + str.charAt(i);
        }
        for (int i = midposition; i < str.length(); i++) {
            result = result + reversemidposition.charAt(index++);
        }

        System.out.println(result);
    }
}

class SecondHalfReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int midString = list.size() / 2;
        String secondhalf = "";

        for (int i = midString; i < list.size(); i++) {
            secondhalf = secondhalf + list.get(i);
        }

        String reversesecondhalf = "";
        for (int i = secondhalf.length() - 1; i >= 0; i--) {
            reversesecondhalf = reversesecondhalf + secondhalf.charAt(i);
        }

        int index = 0;
        StringBuilder finalvalue = new StringBuilder();
        for (int i = 0; i < midString; i++) {
            finalvalue.append(list.get(i));
        }

        for (int i = midString; i < list.size(); i++) {
            finalvalue.append(reversesecondhalf.charAt(index++));
        }

        System.out.println(finalvalue);
    }
}

class SecondHalfReversalUsingCollections {
    public static void reverseUsingCollections(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int midString = list.size() / 2;

        ArrayList<Character> secondhalf = new ArrayList<>();

        for (int i = midString; i < list.size(); i++) {
            secondhalf.add(list.get(i));
        }

        Collections.reverse(secondhalf);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < midString; i++) {
            result.append(list.get(i));
        }

        for (int i = midString; i < list.size(); i++) {
            result.append(secondhalf.get(index++));
        }

        System.out.println(result);
    }
}

public class SecondHalfReverser {
    public static void main(String[] args) {
        SecondHalfReversalUsingLoop.reverseUsingLoop("abcdef");
        // SecondHalfReversalUsingArrayList.reverseUsingArrayList("defghi");
        // SecondHalfReversalUsingCollections.reverseUsingCollections("ghijkl");
    }
}
