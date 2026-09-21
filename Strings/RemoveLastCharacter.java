package Strings;

// Input: Selenium
// Output: Seleniu

class UsingForLoopRemoveLastCharacter {
    public static void UsingForLoopRemoveLastCharacterMethods(String str) {

        String finalvalue = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                continue;
            } else {
                finalvalue = finalvalue + str.charAt(i);
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionRemoveLastCharacter {
    public static void UsingRecursionRemoveLastCharacterMethods(String str, int index, String finalvalue) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }

        char ch = str.charAt(index);
        if (index == str.length() - 1) {
            UsingRecursionRemoveLastCharacterMethods(str, index + 1, finalvalue);
        } else {
            UsingRecursionRemoveLastCharacterMethods(str, index + 1, finalvalue + ch);
        }
    }
}

public class RemoveLastCharacter {
    public static void main(String[] args) {
        UsingForLoopRemoveLastCharacter.UsingForLoopRemoveLastCharacterMethods("Selenium");
        UsingRecursionRemoveLastCharacter
                .UsingRecursionRemoveLastCharacterMethods("Selenium", 0, "");
    }
}
