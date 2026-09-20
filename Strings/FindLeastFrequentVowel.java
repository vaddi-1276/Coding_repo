package Strings;

import java.util.ArrayList;

// Input: automation
// Output: e = 0

class UsingForLoopFindLeastFrequentVowel {
    public static void UsingForLoopFindLeastFrequentVowelMethods(String str) {

        int minimum = Integer.MAX_VALUE;
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        char onlyvowel = ' ';

        for (int i = 0; i < vowels.length; i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == vowels[i]) {
                    count++;
                }
            }
            if (count < minimum) {
                minimum = count;
                onlyvowel = vowels[i];
            }
        }
        System.out.println(onlyvowel + " = " + minimum);
    }
}

class UsingArrayListFindLeastFrequentVowel {
    public static void UsingArrayListFindLeastFrequentVowelMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        int mininum = Integer.MAX_VALUE;
        char mininumchar = ' ';

        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == vowels[i]) {
                    count++;
                }
            }
            if (count < mininum) {
                mininum = count;
                mininumchar = vowels[i];
            }
        }
        System.out.println(mininumchar + " = " + mininum);
    }
}

class UsingRecursionFindLeastFrequentVowel {
    public static void UsingRecursionFindLeastFrequentVowelMethods(String str, int index, int minimum,
            char mininumchar) {

        if (index == str.length()) {
            System.out.println(mininumchar + " = " + minimum);
            return;
        }

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == vowels[i]) {
                    count++;
                }
            }
            if (count < minimum) {
                minimum = count;
                mininumchar = vowels[i];
            }
        }
        UsingRecursionFindLeastFrequentVowelMethods(str, index + 1, minimum, mininumchar);
    }
}

public class FindLeastFrequentVowel {
    public static void main(String[] args) {
        UsingForLoopFindLeastFrequentVowel.UsingForLoopFindLeastFrequentVowelMethods("automation");
        UsingArrayListFindLeastFrequentVowel.UsingArrayListFindLeastFrequentVowelMethods("automation");
        UsingRecursionFindLeastFrequentVowel.UsingRecursionFindLeastFrequentVowelMethods("automation", 0,
                Integer.MAX_VALUE, ' ');
    }
}
