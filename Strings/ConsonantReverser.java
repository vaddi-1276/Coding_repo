package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Automation

// Output:
// Aunotamiot

class ConsonantReversalUsingLoop {
    public static void reverseUsingLoop(String str) {

        String consantsString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                consantsString = consantsString + ch;
            }
        }
        System.out.println(consantsString);
        String reverse_consantsString = "";
        for (int i = consantsString.length() - 1; i >= 0; i--) {
            reverse_consantsString = reverse_consantsString + consantsString.charAt(i);
        }
        System.out.println(reverse_consantsString);

        String result = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result = result + reverse_consantsString.charAt(index++);
            } else {
                result = result + ch;
            }

        }
        System.out.println(result);
    }
}

class ConsonantReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character> consants_string = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                consants_string.add(ch);
            }
        }
        ArrayList<Character> reverse_consants_string = new ArrayList<>();
        for (int i = consants_string.size() - 1; i >= 0; i--) {
            char ch = consants_string.get(i);
            reverse_consants_string.add(ch);
        }
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result.append(reverse_consants_string.get(index++));
            } else {
                result.append(ch);
            }

        }
        System.out.println(result);
    }
}

class ConsonantReversalUsingCollections {
    public static void reverseUsingCollections(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character> consantsString = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                consantsString.add(ch);
            }
        }
        Collections.reverse(consantsString);
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                result.append(consantsString.get(index++));
            } else {
                result.append(ch);
            }

        }
        System.out.println(result);

    }
}

public class ConsonantReverser {
    public static void main(String[] args) {
        ConsonantReversalUsingLoop.reverseUsingLoop("Automation");
        ConsonantReversalUsingArrayList.reverseUsingArrayList("Automation");
        ConsonantReversalUsingCollections.reverseUsingCollections("Automation");
    }
}
