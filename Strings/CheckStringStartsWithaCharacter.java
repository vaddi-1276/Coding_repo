package Strings;

// Input: Selenium
// Character = S

// Output: Yes

class UsingForLoopCheckStringStartsWithaCharacter {
    public static void UsingForLoopCheckStringStartsWithaCharacterMethods(String str, char letter) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                if (ch == letter) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

class UsingRecursionCheckStringStartsWithaCharacter {
    public static void UsingRecursionCheckStringStartsWithaCharacterMethods(String str, int index, char letter) {

        if (index == str.length()) {
            return;
        }

        char ch = str.charAt(index);
        if (index == 0) {
            if (ch == letter) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        UsingRecursionCheckStringStartsWithaCharacterMethods(str, index + 1, letter);
    }
}

public class CheckStringStartsWithaCharacter {
    public static void main(String[] args) {
        UsingForLoopCheckStringStartsWithaCharacter.UsingForLoopCheckStringStartsWithaCharacterMethods("Selenium", 'S');
        UsingRecursionCheckStringStartsWithaCharacter.UsingRecursionCheckStringStartsWithaCharacterMethods("Selenium", 0, 'L');
    }
}
