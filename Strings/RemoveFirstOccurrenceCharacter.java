package Strings;

// Input: programming
// Character = m

class UsingForLoopRemoveFirstOccurrenceCharacter {
    public static void UsingForLoopRemoveFirstOccurrenceCharacterMethods(String str, char letter) {
        int position = str.indexOf(letter);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == position) {
                continue;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

class UsingRecursionRemoveFirstOccurrenceCharacter {
    public static void UsingRecursionRemoveFirstOccurrenceCharacterMethods(String str, int index, int position,
            char letter, String finalString) {

        if (index == str.length()) {
            System.out.println(finalString);
            return;
        }

        char ch = str.charAt(index);
        if (index == position) {
            UsingRecursionRemoveFirstOccurrenceCharacterMethods(
                    str, index + 1, position, letter, finalString);
        } else {
            UsingRecursionRemoveFirstOccurrenceCharacterMethods(
                    str, index + 1, position, letter, finalString + ch);
        }
    }
}

public class RemoveFirstOccurrenceCharacter {
    public static void main(String[] args) {
        UsingForLoopRemoveFirstOccurrenceCharacter.UsingForLoopRemoveFirstOccurrenceCharacterMethods("programming",
                'm');

        // String str = "programming";
        // UsingRecursionRemoveFirstOccurrenceCharacter.UsingRecursionRemoveFirstOccurrenceCharacterMethods(str,
        // 0, str.indexOf('m'), 'm', "");
    }
}
