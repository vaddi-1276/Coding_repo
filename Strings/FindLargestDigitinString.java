package Strings;

// Input: Java583Testing24
// Output: 8

class UsingNestedForLoopFindLargestDigitinString {
    public static void UsingNestedForLoopFindLargestDigitinStringMethods(String str) {

        String onlyDigit = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                onlyDigit = onlyDigit + ch;
            }
        }
        int largestdigit = Integer.MIN_VALUE;
        for (int i = 0; i < onlyDigit.length(); i++) {
            if (onlyDigit.charAt(i) - '0' > largestdigit) {
                largestdigit = onlyDigit.charAt(i) - '0';
            }
        }
        System.out.println(largestdigit);
    }
}

class UsingRecursionFindLargestDigitinString {
    public static void UsingRecursionFindLargestDigitinStringMethods(String str, int index, String onlydigit,
            int largest) {
        if (index == str.length()) {
            System.out.println(largest);
            return;
        }
        char ch = str.charAt(index);
        if (Character.isDigit(ch)) {
            int digit = ch - '0';

            if (digit > largest) {
                largest = digit;
            }
        }
        UsingRecursionFindLargestDigitinStringMethods(str, index + 1, onlydigit, largest);
    }
}

public class FindLargestDigitinString {
    public static void main(String[] args) {
        UsingNestedForLoopFindLargestDigitinString
                .UsingNestedForLoopFindLargestDigitinStringMethods("Java583Testing24");
        UsingRecursionFindLargestDigitinString
                .UsingRecursionFindLargestDigitinStringMethods("Java583Testing24", 0, "",
                        Integer.MIN_VALUE);
    }
}
