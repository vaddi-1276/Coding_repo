package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// ebcdaf

class UsingNestedForLoopReverseOnlyEvenIndexCharacters {
    public static void UsingNestedForLoopReverseOnlyEvenIndexCharactersMethods(String str) {

        String evendigitString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                evendigitString = evendigitString + ch;

            }
        }
        String reverseevendigitString = "";
        for (int i = evendigitString.length() - 1; i >= 0; i--) {
            reverseevendigitString = reverseevendigitString + evendigitString.charAt(i);
        }
        int index = 0;
        String final_value = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                final_value = final_value + reverseevendigitString.charAt(index++);
            } else {
                final_value = final_value + ch;
            }
        }
        System.out.println(final_value);
    }
}

class UsingArrayListCollectionsReverseOnlyEvenIndexCharacters {
    public static void UsingArrayListCollectionsReverseOnlyEvenIndexCharactersMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> evenlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                evenlist.add(list.get(i));
            }
        }
        Collections.reverse(evenlist);

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.append(evenlist.get(index++));
            } else {
                result.append(list.get(i));
            }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyEvenIndexCharacters {
    public static void main(String[] args) {
        UsingNestedForLoopReverseOnlyEvenIndexCharacters
                .UsingNestedForLoopReverseOnlyEvenIndexCharactersMethods("abcdef");
        UsingArrayListCollectionsReverseOnlyEvenIndexCharacters
                .UsingArrayListCollectionsReverseOnlyEvenIndexCharactersMethods("abcdef");
    }
}
