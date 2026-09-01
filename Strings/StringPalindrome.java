package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// madam

// Output:
// Palindrome

class PalindromeUsingLoop {

    public static void isPalindromeUsingLoop(String str) {

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        if (str.equals(result)) {
            System.out.println(result + " is Palindrome");
        } else {
            System.out.println(result + " is not Palindrome");
        }
    }
}

class PalindromeUsingStringBuilder {
    public static void isPalindromeUsingStringBuilder(String str) {

        String result = new StringBuilder(str).reverse().toString();
        if (str.equals(result)) {
            System.out.println(result + " is Palindrome");
        } else {
            System.out.println(result + " is not Palindrome");
        }
    }
}

class PalindromeUsingArrayList {
    public static void isPalindromeUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.append(list.get(i));
        }

        if (str.equals(result.toString())) {
            System.out.println(result + " is Palindrome");
        } else {
            System.out.println(result + " is not Palindrome");
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
            System.out.println(result + " is Palindrome");
        } else {
            System.out.println(result + " is not Palindrome");
        }
    }
}

class PalindromeReverse {

    static String result = "";

    public static void PalindromeReverseMethods(String str, int index) {

        if (index < 0)
            return;
        result = result + str.charAt(index);
        PalindromeReverseMethods(str, index - 1);
    }
}

class PalindromeRecursion {
    public static void PalindromeRecursionMethods(String str) {
        if (str.equals(PalindromeReverse.result)) {
            System.out.println(PalindromeReverse.result + " is palindrome");
        } else {
            System.out.println(PalindromeReverse.result + " is not Plaindrome");
        }
    }
}

public class StringPalindrome {
    public static void main(String[] args) {
        PalindromeUsingLoop.isPalindromeUsingLoop("madam");
        PalindromeUsingStringBuilder.isPalindromeUsingStringBuilder("madam");
        PalindromeUsingArrayList.isPalindromeUsingArrayList("madam");
        PalindromeUsingCollections.isPalindromeUsingCollections("madam");
        PalindromeReverse.PalindromeReverseMethods("like", "like".length() - 1);
        PalindromeRecursion.PalindromeRecursionMethods("like");

    }
}
