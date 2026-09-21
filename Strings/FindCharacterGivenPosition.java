package Strings;

// Input: Selenium
// Position = 4

// Output: e

class UsingForLoopFindCharacterGivenPosition {
    public static void UsingForLoopFindCharacterGivenPositionMethods(String str, int position) {

        for (int i = 0; i < str.length(); i++) {
            if (i == position - 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}

class UsingRecursionFindCharacterGivenPosition {
    public static void UsingRecursionFindCharacterGivenPositionMethods(String str, int index, int position) {

        if (index == str.length()) {
            return;
        }
        char ch = str.charAt(index);
        if (index == position - 1) {
            System.out.println(ch);
            return;
        }
        UsingRecursionFindCharacterGivenPositionMethods(str, index + 1, position);
    }
}

public class FindCharacterGivenPosition {
    public static void main(String[] args) {
        UsingForLoopFindCharacterGivenPosition.UsingForLoopFindCharacterGivenPositionMethods("Selenium", 6);
        UsingRecursionFindCharacterGivenPosition.UsingRecursionFindCharacterGivenPositionMethods("Selenium", 0, 4);
    }
}
