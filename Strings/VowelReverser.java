package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Automation

// Output:
// oitamotuAn

class VowelReversalUsingLoop {
    public static void reverseUsingLoop(String str) {

        String onlyvowelString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                onlyvowelString = onlyvowelString + ch;
            }
        }

        String reverseonlyvowelString = "";
        for (int i = onlyvowelString.length() - 1; i >= 0; i--) {
            reverseonlyvowelString = reverseonlyvowelString + onlyvowelString.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result = result + reverseonlyvowelString.charAt(index++);
            } else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}

class VowelReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        String onlyvowelsString = "";
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                onlyvowelsString = onlyvowelsString + ch;
            }
        }
        String reverseonlyvowelsString = "";
        for (int i = onlyvowelsString.length() - 1; i >= 0; i--) {
            reverseonlyvowelsString = reverseonlyvowelsString + onlyvowelsString.charAt(i);
        }
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result.append(reverseonlyvowelsString.charAt(index++));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

class VowelReversalUsingCollections {
    public static void reverseUsingCollections(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> onlyVowelsCharacters = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                onlyVowelsCharacters.add(ch);
            }
        }
        Collections.reverse(onlyVowelsCharacters);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result.append(onlyVowelsCharacters.get(index++));
            } else {
                result.append(ch);
            }

        }
        System.out.println(result);
    }
}

public class VowelReverser {
    public static void main(String[] args) {
        VowelReversalUsingLoop.reverseUsingLoop("Automation");
        // VowelReversalUsingArrayList.reverseUsingArrayList("Automation");
        // VowelReversalUsingCollections.reverseUsingCollections("Automation");
    }
}
