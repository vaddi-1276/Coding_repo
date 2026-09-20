package Strings;

// Input: Java123456Testing

// Output:
// Even = 3
// Odd = 3

class UsingCharFunctionCountEvenandOddDigits {
    public static void UsingCharFunctionCountEvenandOddDigitsMethods(String str) {

        String digitvalue = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitvalue = digitvalue + ch;
            }
        }
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < digitvalue.length(); i++) {
            char ch = digitvalue.charAt(i);

            if (ch % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Even = " + evencount);
        System.out.println("Odd = " + oddcount);
    }
}

class UsingRecursionCountEvenandOddDigits {
    public static void UsingRecursionCountEvenandOddDigitsMethods(String str, int index, String finalvalue,
            int evencount, int oddcount) {

        if (index == str.length()) {
            System.out.println("Even Count using Recursion " + evencount);
            System.out.println("Odd Count using Recursion " + oddcount);
            return;
        }
        char ch = str.charAt(index);

        if (Character.isDigit(ch)) {

            if (ch % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        UsingRecursionCountEvenandOddDigitsMethods(str, index + 1, finalvalue, evencount, oddcount);
    }
}

public class CountEvenandOddDigits {
    public static void main(String[] args) {
        UsingCharFunctionCountEvenandOddDigits.UsingCharFunctionCountEvenandOddDigitsMethods("Java123456Testing");
        UsingRecursionCountEvenandOddDigits.UsingRecursionCountEvenandOddDigitsMethods("Java123456Testing", 0, "", 0,
                0);
    }
}
