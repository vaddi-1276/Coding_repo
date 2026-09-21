package Strings;

// Input: Selenium

// Output: elenium

class UsingForLoopRemoveFirstCharacter {
    public static void UsingForLoopRemoveFirstCharacterMethods(String str) {

        String finalvalue = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                continue;
            } else {
                finalvalue = finalvalue + str.charAt(i);
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionRemoveFirstCharacter {
    public static void UsingRecursionRemoveFirstCharacterMethods(String str, int index, String finalvalue) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }

        char ch = str.charAt(index);
        if (index == 0) {
            UsingRecursionRemoveFirstCharacterMethods(str, index + 1, finalvalue);
        } else {
            UsingRecursionRemoveFirstCharacterMethods(str, index + 1, finalvalue + ch);
        }
    }
}

public class RemoveFirstCharacter {
    public static void main(String[] args) {
        UsingForLoopRemoveFirstCharacter.UsingForLoopRemoveFirstCharacterMethods("Selenium");
        UsingRecursionRemoveFirstCharacter.UsingRecursionRemoveFirstCharacterMethods("Selenium", 0, "");
    }
}
