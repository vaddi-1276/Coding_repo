package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Automation

// Output:
// Aotumation

class VowelReversalUsingLoop {
    public static void reverseUsingLoop(String str) {
        String vowelString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowelString = vowelString + ch;
            }
        }

        String reverse_vowelsString = "";
        for (int i = vowelString.length() - 1; i >= 0; i--) {
            reverse_vowelsString = reverse_vowelsString + vowelString.charAt(i);
        }
        System.out.println(reverse_vowelsString);

        String final_value = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                final_value = final_value + reverse_vowelsString.charAt(index++);
            } else {
                final_value = final_value + str.charAt(i);
            }

        }
        System.out.println(final_value);
    }
}

class VowelReversalUsingArrayList {
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> vowelsString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowelsString.add(ch);
            }
        }

        ArrayList<Character> reverseVowelsString = new ArrayList<>();

        for (int j = vowelsString.size() - 1; j >= 0; j--) {
            char ch = vowelsString.get(j);
            reverseVowelsString.add(ch);
        }

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result.append(reverseVowelsString.get(index++));
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

        ArrayList<Character> vowelsString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowelsString.add(ch);
            }
        }
        Collections.reverse(vowelsString);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result.append(vowelsString.get(index++));
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
        VowelReversalUsingArrayList.reverseUsingArrayList("Selenium");
        VowelReversalUsingCollections.reverseUsingCollections("Automation");
    }
}
