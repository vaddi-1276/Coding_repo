package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// madam

// Output:
// Palindrome

class PalindromeUsingLoop {

    public static void isPalindromeUsingLoop(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Plaindrome");
        }
    }
}

class PalindromeUsingStringBuilder {
    public static void isPalindromeUsingStringBuilder(String str) {
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Plaindrome");
        }
    }
}

class PalindromeUsingArrayList {
    public static void isPalindromeUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        System.out.println(list);

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(list.get(i));
        }
        System.out.println(result);

        if (str.equals(result.toString())) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }
}

class PalindromeUsingCollections {

    public static void isPalindromeUsingCollections(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }

        if (str.equals(result.toString())) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }
}

public class StringPalindrome {
    public static void main(String[] args) {
        PalindromeUsingLoop.isPalindromeUsingLoop("like");
        PalindromeUsingStringBuilder.isPalindromeUsingStringBuilder("madam");
        PalindromeUsingArrayList.isPalindromeUsingArrayList("like");
        PalindromeUsingCollections.isPalindromeUsingCollections("madam");

    }
}
