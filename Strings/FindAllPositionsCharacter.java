package Strings;

// Input: programming
// Character = g

// Output: 3, 10

class UsingForLoopFindAllPositionsCharacter {
    public static void UsingForLoopFindAllPositionsCharacterMethods(String str, char letter) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == letter) {
                System.out.println(i);
            }
        }
    }
}

class UsingRecursionFindAllPositionsCharacter {
    public static void UsingRecursionFindAllPositionsCharacterMethods(String str, int index, char letter) {

        if (index == str.length()) {
            return;
        }

        char ch = str.charAt(index);
        if (ch == letter) {
            System.out.println(index);
        }
        UsingRecursionFindAllPositionsCharacterMethods(str, index+1, letter);
    }
}

public class FindAllPositionsCharacter {
    public static void main(String[] args) {
        UsingForLoopFindAllPositionsCharacter.UsingForLoopFindAllPositionsCharacterMethods("programming", 'g');
        UsingRecursionFindAllPositionsCharacter.UsingRecursionFindAllPositionsCharacterMethods("programming", 0, 'g');
    }
}
