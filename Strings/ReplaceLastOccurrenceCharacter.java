package Strings;

// Input: programming
// Character = m
// Replace With = X

class UsingForLoopReplaceLastOccurrenceCharacter {
    public static void UsingForLoopReplaceLastOccurrenceCharacterMethods(String str, char letter,
            String finalvalueString) {

        int position = str.lastIndexOf(letter);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == position) {
                finalvalueString = finalvalueString + "X";
            } else {
                finalvalueString = finalvalueString + ch;
            }
        }
        System.out.println(finalvalueString);
    }
}

class UsingRecursionReplaceLastOccurrenceCharacter {
    public static void UsingRecursionReplaceLastOccurrenceCharacterMethods(String str, int index, char letter,
            String finalString, int position) {

        if (index == str.length()) {
            System.out.println(finalString);
            return;
        }

        char ch = str.charAt(index);
        if (index == position) {
            finalString = finalString + "X";
        } else {
            finalString = finalString + ch;
        }
        UsingRecursionReplaceLastOccurrenceCharacterMethods(str, index + 1, letter, finalString, position);
    }
}

public class ReplaceLastOccurrenceCharacter {
    public static void main(String[] args) {
        UsingForLoopReplaceLastOccurrenceCharacter.UsingForLoopReplaceLastOccurrenceCharacterMethods("programming", 'm',
                "");

        String str = "programming";
        UsingRecursionReplaceLastOccurrenceCharacter.UsingRecursionReplaceLastOccurrenceCharacterMethods(str,
                0, 'r', "", str.lastIndexOf('r'));
    }
}
