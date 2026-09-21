package Strings;

import java.util.ArrayList;

// Input: automation
// Character = a

// Output: 2

class UsingNestedForLoopFindNumberOccurrencesCharacter {
    public static void UsingNestedForLoopFindNumberOccurrencesCharacterMethods(String str) {

        char ch = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(ch + " = " + count);
    }
}

class UsingArrayListFindNumberOccurrencesCharacter {
    public static void UsingArrayListFindNumberOccurrencesCharacterMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ch) {
                count++;
            }
        }
        System.out.println(ch + " = " + count);
    }
}

class UsingRecursionFindNumberOccurrencesCharacter {
    public static void UsingRecursionFindNumberOccurrencesCharacterMethods(String str, int index, char ch,int count) {
        if (index == str.length()) {
            System.out.println(ch + " = " + count);
            return;
        }
        if (str.charAt(index) == ch) {
            count++;
        }
        UsingRecursionFindNumberOccurrencesCharacterMethods(str, index + 1, ch,count);
    }
}

public class FindNumberOccurrencesCharacter {
    public static void main(String[] args) {
        UsingNestedForLoopFindNumberOccurrencesCharacter
                .UsingNestedForLoopFindNumberOccurrencesCharacterMethods("automation");
        UsingArrayListFindNumberOccurrencesCharacter.UsingArrayListFindNumberOccurrencesCharacterMethods("automation");
        UsingRecursionFindNumberOccurrencesCharacter.UsingRecursionFindNumberOccurrencesCharacterMethods("automation",
                0, 'a',0);
    }
}
