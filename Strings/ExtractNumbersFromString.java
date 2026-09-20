package Strings;

// Input: Java123Testing456

// Output: 123456

class WithoutUsingCharExtractNumbersFromString {
    public static void WithoutUsingCharExtractNumbersFromStringMethods(String str) {

        String onlyextractnumber = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                onlyextractnumber = onlyextractnumber + ch;
            }
        }
        System.out.println(onlyextractnumber);
    }
}

class UsingCharacterisDigitFunctionExtractNumbersFromString {
    public static void UsingCharacterisDigitFunctionExtractNumbersFromStringMethods(String str) {

        String onlydigitString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                onlydigitString = onlydigitString + ch;
            }
        }
        System.out.println(onlydigitString);
    }
}

class UsingRecursionExtractNumbersFromString {
    public static void UsingRecursionExtractNumbersFromStringMethods(String str, int index, String finalvalue) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }

        char ch = str.charAt(index);
        if (Character.isDigit(ch)) {
            finalvalue = finalvalue + ch;
        }
        UsingRecursionExtractNumbersFromStringMethods(str, index + 1, finalvalue);
    }
}

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        WithoutUsingCharExtractNumbersFromString.WithoutUsingCharExtractNumbersFromStringMethods("Java123Testing456");
        UsingCharacterisDigitFunctionExtractNumbersFromString
                .UsingCharacterisDigitFunctionExtractNumbersFromStringMethods("Java123Testing456");
        UsingRecursionExtractNumbersFromString.UsingRecursionExtractNumbersFromStringMethods("Java123Testing456", 0,
                "");
    }
}
