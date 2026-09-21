package Strings;

// Input: Java
// Selenium

// Output: No

class UsingLoopCheckTwoStringsHaveSameLength {
    public static void UsingLoopCheckTwoStringsHaveSameLengthMethods(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

class UsingMathabsCheckTwoStringsHaveSameLength {
    public static void UsingMathabsCheckTwoStringsHaveSameLengthMethods(String str1, String str2) {

        int difference = Math.abs(str1.length() - str2.length());
        if (difference == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class CheckTwoStringsHaveSameLength {
    public static void main(String[] args) {
        UsingLoopCheckTwoStringsHaveSameLength.UsingLoopCheckTwoStringsHaveSameLengthMethods("Java",
                "Python");
        UsingMathabsCheckTwoStringsHaveSameLength.UsingMathabsCheckTwoStringsHaveSameLengthMethods("Java", "Java");

    }
}
