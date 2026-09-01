package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// automation

// Output:
// Reverse = noitamotua
// Vowels = 6

class UsingForLoopReverseCountVowels {
    public static void UsingForLoopReverseCountVowelsMethods(String str) {

        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println("Reverse = " + reverseString);
        int countofVowels = 0;
        for (int i = 0; i < reverseString.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                countofVowels++;
            }
        }
        System.out.println(countofVowels);
    }
}

class UsingArrayListCollectionsReverseBuiltinReverseCountVowels {
    public static void UsingArrayListCollectionsReverseBuiltinReverseCountVowelsMethods(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }
        System.out.println("Reverse " + result);
        int countofVowels = 0;

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                countofVowels++;
            }
        }
        System.out.println(countofVowels);
    }
}

public class ReverseCountVowels {
    public static void main(String[] args) {
        UsingForLoopReverseCountVowels.UsingForLoopReverseCountVowelsMethods("automationaeiouAEIOU");
        UsingArrayListCollectionsReverseBuiltinReverseCountVowels
                .UsingArrayListCollectionsReverseBuiltinReverseCountVowelsMethods("automationaeiouAEIOU");
    }
}
