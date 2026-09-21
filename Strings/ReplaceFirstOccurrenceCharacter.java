package Strings;

// Input: programming
// Character = m
// Replace With = X

// Output: prograXming

class UsingForLoopReplaceFirstOccurrenceCharacter {
    public static void UsingForLoopReplaceFirstOccurrenceCharacterMethods(String str, char letter) {

        String finalvalue = "";
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == letter && !found) {
                finalvalue = finalvalue + "X";
                found = true;
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionReplaceFirstOccurrenceCharacter {
    public static void UsingRecursionReplaceFirstOccurrenceCharacterMethods(String str, int index, boolean found,
            char letter, String finalString) {

        if (index == str.length()) {
            System.out.println(finalString);
            return;
        }

        char ch = str.charAt(index);
        if (ch == letter && !found) {
            finalString = finalString + "X";
            found = true;
        } else {
            finalString = finalString + ch;
        }
        UsingRecursionReplaceFirstOccurrenceCharacterMethods(str, index + 1, found, letter, finalString);
    }
}

class IndexofReplaceFirstOccurrenceCharacter {
    public static void IndexofReplaceFirstOccurrenceCharacterMethods(String str, char letter) {

        int position = str.indexOf(letter);
        String finalvalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == position) {
                finalvalue = finalvalue + "X";
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

public class ReplaceFirstOccurrenceCharacter {
    public static void main(String[] args) {
        UsingForLoopReplaceFirstOccurrenceCharacter.UsingForLoopReplaceFirstOccurrenceCharacterMethods("programming",
                'm');
        UsingRecursionReplaceFirstOccurrenceCharacter
                .UsingRecursionReplaceFirstOccurrenceCharacterMethods("programming", 0,
                        false, 'm', "");
        IndexofReplaceFirstOccurrenceCharacter.IndexofReplaceFirstOccurrenceCharacterMethods("programming", 'm');
    }
}
