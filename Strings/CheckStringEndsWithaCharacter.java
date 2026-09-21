package Strings;

import java.util.ArrayList;

// Input: Selenium
// Character = m

// Output: Yes

class UsingForLoopCheckStringEndsWithaCharacter {
    public static void UsingForLoopCheckStringEndsWithaCharacterMethods(String str, char letter) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == str.length() - 1) {
                if (ch == letter) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

class UsingArrayListCheckStringEndsWithaCharacter {
    public static void UsingArrayListCheckStringEndsWithaCharacterMethods(String str, char letter) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (i == list.size() - 1) {
                if (ch == letter) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

class UsingRecursionCheckStringEndsWithaCharacter {
    public static void UsingRecursionCheckStringEndsWithaCharacterMethods(String str, int index, char letter) {

        if (index == str.length()) {
            return;
        }
        char ch = str.charAt(index);
        if (index == str.length()-1) {
            if (ch == letter) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        UsingRecursionCheckStringEndsWithaCharacterMethods(str, index + 1, letter);
    }
}

public class CheckStringEndsWithaCharacter {
    public static void main(String[] args) {
        UsingForLoopCheckStringEndsWithaCharacter.UsingForLoopCheckStringEndsWithaCharacterMethods("Selenium", 'm');
        UsingArrayListCheckStringEndsWithaCharacter.UsingArrayListCheckStringEndsWithaCharacterMethods("Selenium", 'm');
        UsingRecursionCheckStringEndsWithaCharacter.UsingRecursionCheckStringEndsWithaCharacterMethods("Selenium", 0, 'm');
    }
}
