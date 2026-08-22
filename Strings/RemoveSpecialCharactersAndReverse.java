package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java@123#Selenium!

// Output:
// Without Special Characters = Java123Selenium
// Reverse = muineleS321avaJ

class UsingForLoopRemoveSpecialCharactersAndReverse {
    public static void UsingForLoopRemoveSpecialCharactersAndReverseMethods(String str) {

        String withoutspecialcharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                withoutspecialcharacters = withoutspecialcharacters + ch;
            }
        }
        System.out.println("Without Special Characters = " + withoutspecialcharacters);

        String Reverse = "";
        for (int i = withoutspecialcharacters.length() - 1; i >= 0; i--) {
            Reverse = Reverse + withoutspecialcharacters.charAt(i);
        }
        System.out.println("Reverse = " + Reverse);
    }
}

class UsingArrayListCollectionsReverseRemoveSpecialCharactersAndReverse {
    public static void UsingArrayListCollectionsReverseRemoveSpecialCharactersAndReverseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character> onlyCharacters = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (Character.isLetter(ch)) {
                onlyCharacters.add(list.get(i));
            } else if (Character.isDigit(ch)) {
                onlyCharacters.add(list.get(i));
            }
        }

        StringBuilder onlyCharactersString = new StringBuilder();
        int value = 0;
        for (int i = 0; i < onlyCharacters.size(); i++) {
            onlyCharactersString.append(onlyCharacters.get(value++));
        }

        System.out.println("Without Special Charcaters = " + onlyCharactersString);
        Collections.reverse(onlyCharacters);

        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < onlyCharacters.size(); i++) {
            result.append(onlyCharacters.get(index++));
        }

        System.out.println("Reverse = " + result);

    }
}

public class RemoveSpecialCharactersAndReverse {
    public static void main(String[] args) {
        UsingForLoopRemoveSpecialCharactersAndReverse
                .UsingForLoopRemoveSpecialCharactersAndReverseMethods("Java@123#Selenium!");
        UsingArrayListCollectionsReverseRemoveSpecialCharactersAndReverse
                .UsingArrayListCollectionsReverseRemoveSpecialCharactersAndReverseMethods("Java@123#Selenium!");
    }
}
