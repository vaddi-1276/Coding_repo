package Strings;

import java.util.ArrayList;

// Input: Apple is an Orange and Banana

// Output:
// Apple
// is
// an
// Orange

class UsingNestedForLoopExtractWordsStartingWithaVowel {
    public static void UsingNestedForLoopExtractWordsStartingWithaVowelMethods(String str) {

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O'
                    || word.charAt(0) == 'U' || word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i'
                    || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}

class UsingArrayListExtractWordsStartingWithaVowel {
    public static void UsingArrayListExtractWordsStartingWithaVowelMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O'
                    || word.charAt(0) == 'U' || word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i'
                    || word.charAt(0) == 'o' || word.charAt(0) == 'u') {

                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}

class UsingRecursionExtractWordsStartingWithaVowel {
    public static void UsingRecursionExtractWordsStartingWithaVowelMethods(String str, String words[], int index) {

        if (index == words.length) {
            return;
        }

        String word = words[index];
        if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O'
                || word.charAt(0) == 'U' || word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i'
                || word.charAt(0) == 'o' || word.charAt(0) == 'u') {

            System.out.print(word+" ");
        }
        UsingRecursionExtractWordsStartingWithaVowelMethods(str, words, index + 1);
    }
}

public class ExtractWordsStartingWithaVowel {
    public static void main(String[] args) {
        UsingNestedForLoopExtractWordsStartingWithaVowel
                .UsingNestedForLoopExtractWordsStartingWithaVowelMethods("Apple is an Orange and Banana");
        UsingArrayListExtractWordsStartingWithaVowel
                .UsingArrayListExtractWordsStartingWithaVowelMethods("Apple is an Orange and Banana");
        UsingRecursionExtractWordsStartingWithaVowel.UsingRecursionExtractWordsStartingWithaVowelMethods(
                "Apple is an Orange and Banana", "Apple is an Orange and Banana".split(" "), 0);
        System.out.println();
    }
}
