package Strings;

// Input: Java583Testing24
// Output: 2

class UsingNestedForLoopFindSmallestDigitinString {
    public static void UsingNestedForLoopFindSmallestDigitinStringMethods(String str) {

        String onlynumbersString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                onlynumbersString = onlynumbersString + ch;
            }
        }
        System.out.println(onlynumbersString);
        int smallestdigit = Integer.MAX_VALUE;

        for (int i = 0; i < onlynumbersString.length(); i++) {
            char ch = onlynumbersString.charAt(i);

            if (ch - '0' < smallestdigit) {
                smallestdigit = ch-'0';
            }
        }
        System.out.println(smallestdigit);
    }
}

class UsingRecursionFindSmallestDigitinString {
    public static void UsingRecursionFindSmallestDigitinStringMethods(String str, int index, int firstsmallest) {

        if (index == str.length()) {
            System.out.println(firstsmallest);
            return;
        }
        char ch = str.charAt(index);
        if (Character.isDigit(ch)) {
            int digit = ch - '0';
            if (digit < firstsmallest) {
                firstsmallest = digit;
            }
        }
        UsingRecursionFindSmallestDigitinStringMethods(str, index + 1, firstsmallest);
    }
}

public class FindSmallestDigitinString {
    public static void main(String[] args) {
        UsingNestedForLoopFindSmallestDigitinString
                .UsingNestedForLoopFindSmallestDigitinStringMethods("Java583Testing24");
        // UsingRecursionFindSmallestDigitinString.UsingRecursionFindSmallestDigitinStringMethods("Java583Testing24",
        // 0,
        // Integer.MAX_VALUE);
    }
}
