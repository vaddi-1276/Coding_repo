package Strings;

import java.util.ArrayList;

// Input: automation
// Output: a = 2

class UsingNestedForLoopFindMostFrequentVowel {
    public static void UsingNestedForLoopFindMostFrequentVowelMethods(String str) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        int maximumcount = Integer.MIN_VALUE;
        char maximumchar = ' ';

        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (vowels[i] == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maximumcount) {
                maximumcount = count;
                maximumchar = vowels[i];
            }
        }
        System.out.println(maximumchar + " = " + maximumcount);
    }
}

class UsingArrayListFindMostFrequentVowel {
    public static void UsingArrayListFindMostFrequentVowelMethods(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        int maximumcount = Integer.MIN_VALUE;
        char maximumchar = ' ';

        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (vowels[i] == list.get(j)) {
                    count++;
                }
            }
            if (count > maximumcount) {
                maximumcount = count;
                maximumchar = vowels[i];
            }
        }
        System.out.println(maximumchar + " = " + maximumcount);
    }
}

class UsingRecursionFindMostFrequentVowel {
    public static void UsingRecursionFindMostFrequentVowelMethods(String str, int index, int maximumcount,
            char maximumchar) {

        if (index == str.length()) {
            System.out.println(maximumchar + " = " + maximumcount);
            return;
        }

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (vowels[i] == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maximumcount) {
                maximumcount = count;
                maximumchar = vowels[i];
            }
        }
        UsingRecursionFindMostFrequentVowelMethods(str, index + 1, maximumcount, maximumchar);
    }
}

public class FindMostFrequentVowel {
    public static void main(String[] args) {
        UsingNestedForLoopFindMostFrequentVowel.UsingNestedForLoopFindMostFrequentVowelMethods("automation");
        UsingArrayListFindMostFrequentVowel.UsingArrayListFindMostFrequentVowelMethods("automation");
        UsingRecursionFindMostFrequentVowel.UsingRecursionFindMostFrequentVowelMethods("automation", 0,
                Integer.MIN_VALUE, ' ');
    }
}
