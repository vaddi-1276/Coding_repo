package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// madam

// Output:
// Reverse = madam
// Palindrome = Yes

class UsingForLoopReversePalindromeCheck {
    public static void UsingForLoopReversePalindromeCheckMethods(String str) {

        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        if (str.equals(reverseString)) {
            System.out.println(str + " Reverse = " + reverseString);
            System.out.println("Palindrome = Yes ");
        } else {
            System.out.println("Palindrome = No");
        }
    }
}

class UsingStringBuilderReversePalindromeCheck {
    public static void UsingStringBuilderReversePalindromeCheckMethods(String str) {

        String result = new StringBuilder(str).reverse().toString();

        if (str.equals(result)) {
            System.out.println(str + " Reverse = " + result);
            System.out.println("Palindrome = Yes ");
        } else {
            System.out.println("Palindrome = No");
        }
    }
}

class UsingArrayListCollectionsReverseBuiltinReversePalindromeCheck {
    public static void UsingArrayListCollectionsReverseBuiltinReversePalindromeCheckMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        Collections.reverse(list);
        System.out.println(list);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }
        System.out.println(result);

        if (str.equals(result.toString())) {
            System.out.println(str + " Reverse = " + result);
            System.out.println("Palindrome = Yes ");
        } else {
            System.out.println("Palindrome = No");
        }
    }
}

public class ReversePalindromeCheck {
    public static void main(String[] args) {
        UsingForLoopReversePalindromeCheck.UsingForLoopReversePalindromeCheckMethods("madam");
        UsingStringBuilderReversePalindromeCheck.UsingStringBuilderReversePalindromeCheckMethods("like");
        UsingArrayListCollectionsReverseBuiltinReversePalindromeCheck
                .UsingArrayListCollectionsReverseBuiltinReversePalindromeCheckMethods("madam");
    }
}
