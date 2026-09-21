package Strings;

import java.util.ArrayList;

// Input: ABC

// Output: A = 65
// B = 66
// C = 67

class UsingForLoopFindASCIIValueEachCharacter {
    public static void UsingForLoopFindASCIIValueEachCharacterMethods(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }
}

class UsingArrayListFindASCIIValueEachCharacter {
    public static void UsingArrayListFindASCIIValueEachCharacterMethods(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            System.out.println(ch + " = " + (int) ch);
        }
    }
}

class UsingRecursionFindASCIIValueEachCharacter {
    public static void UsingRecursionFindASCIIValueEachCharacterMethods(String str, int index) {

        if (index == str.length()) {
            return;
        }
        char ch = str.charAt(index);
        System.out.println(ch + " = " + (int) ch);
        UsingRecursionFindASCIIValueEachCharacterMethods(str, index + 1);
    }
}

public class FindASCIIValueEachCharacter {
    public static void main(String[] args) {
        UsingForLoopFindASCIIValueEachCharacter.UsingForLoopFindASCIIValueEachCharacterMethods("ABC");
        System.out.println("----------------------------------------------------------------------");
        UsingArrayListFindASCIIValueEachCharacter.UsingArrayListFindASCIIValueEachCharacterMethods("ABCD");
        System.out.println("----------------------------------------------------------------------");
        UsingRecursionFindASCIIValueEachCharacter.UsingRecursionFindASCIIValueEachCharacterMethods("ABCDE", 0);
    }
}
