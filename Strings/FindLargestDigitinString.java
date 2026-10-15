package Strings;

// Input: Java583Testing24
// Output: 8

class UsingNestedForLoopFindLargestDigitinString {
    public static void UsingNestedForLoopFindLargestDigitinStringMethods(String str) {
        String onlyDigitString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                onlyDigitString = onlyDigitString + ch;
            }
        }

        int largestdigit = Integer.MIN_VALUE;
        char largestchar=' ';
        for (int i = 0; i < onlyDigitString.length(); i++) {
            char ch = onlyDigitString.charAt(i);
            int digit=Character.getNumericValue(ch);
            if (digit > largestdigit) {

                largestdigit=digit;
                largestchar = ch;
            }
        }
        System.out.println(largestchar);
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
        // UsingRecursionFindLargestDigitinString
        // .UsingRecursionFindLargestDigitinStringMethods("Java583Testing24", 0, "",
        // Integer.MIN_VALUE);
    }
}
