package Strings;

// Input: programming
// Character = m

class UsingForLoopRemoveLastOccurrenceCharacter {
    public static void UsingForLoopRemoveLastOccurrenceCharacterMethods(String str, char letter) {

        int position = str.lastIndexOf(letter);
        String finalvalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == position) {
                continue;
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionRemoveLastOccurrenceCharacter {

    public static void UsingRecursionRemoveLastOccurrenceCharacterMethods(String str, int index, char letter,
            int position, String finalvalue) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }
        char ch = str.charAt(index);

        if (index == position) {
            UsingRecursionRemoveLastOccurrenceCharacterMethods(str, index + 1, letter, position, finalvalue);
        } else {
            UsingRecursionRemoveLastOccurrenceCharacterMethods(str, index + 1, letter, position, finalvalue + ch);
        }
    }
}

class UsingBooleanRemoveLastOccurrenceCharacter {
    public static void UsingBooleanRemoveLastOccurrenceCharacterMethods(String str, char letter) {

        String finalvalue = "";
        boolean removed = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == letter && removed == false) {
                removed = true;
                continue;
            }

            else {
                finalvalue = ch + finalvalue;
            }
        }
        System.out.println(finalvalue);
    }
}

public class RemoveLastOccurrenceCharacter {
    public static void main(String[] args) {
        UsingForLoopRemoveLastOccurrenceCharacter.UsingForLoopRemoveLastOccurrenceCharacterMethods("programming", 'r');
        String str = "programming";
        UsingRecursionRemoveLastOccurrenceCharacter.UsingRecursionRemoveLastOccurrenceCharacterMethods(str, 0, 'r',
                str.lastIndexOf('r'), "");
        UsingBooleanRemoveLastOccurrenceCharacter.UsingBooleanRemoveLastOccurrenceCharacterMethods("programming", 'g');
    }
}
