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

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);

        int countofVowels = 0;

        for (int i = 0; i < result.length(); i++) {
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
        System.out.println(list);

        int count_of_vowels = 1;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count_of_vowels++;
            }

        }
        System.out.println(count_of_vowels);
    }
}

public class ReverseCountVowels {
    public static void main(String[] args) {
        UsingForLoopReverseCountVowels.UsingForLoopReverseCountVowelsMethods("automation");
        UsingArrayListCollectionsReverseBuiltinReverseCountVowels
                .UsingArrayListCollectionsReverseBuiltinReverseCountVowelsMethods("automation");
    }
}
