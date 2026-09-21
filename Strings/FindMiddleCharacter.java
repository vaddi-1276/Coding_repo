package Strings;

// Input: Selenium
// Output: n

class UsingNestedForLoopFindMiddleCharacter {
    public static void UsingNestedForLoopFindMiddleCharacterMethods(String str) {

        int position = str.length() / 2;
        for (int i = 0; i < str.length(); i++) {
            if (i == position) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

class UsingRecursionFindMiddleCharacter {
    public static void UsingRecursionFindMiddleCharacterMethods(String str, int index, int position) {
        if (index == str.length()) {
            return;
        }
        if (index == position) {
            System.out.println(str.charAt(index));
        }
        UsingRecursionFindMiddleCharacterMethods(str, index + 1, position);
    }
}

public class FindMiddleCharacter {
    public static void main(String[] args) {
        UsingNestedForLoopFindMiddleCharacter.UsingNestedForLoopFindMiddleCharacterMethods("Selenium");

        String str="Selenium";
        UsingRecursionFindMiddleCharacter.UsingRecursionFindMiddleCharacterMethods(str, 0, str.length()/2);
    }
}
