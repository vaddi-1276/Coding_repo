package Strings;

import java.util.ArrayList;

// Input:
// java selenium testing

// Output:
// javaSeleniumTesting

class UsingSubstringCamelCaseConversion {
    public static void UsingSubstringCamelCaseConversionMethods(String str) {

        String words[] = str.split(" ");
        String firstword = words[0];
        String result = "";
        result = result + firstword;

        for (int i = 1; i < words.length; i++) {
            String word = words[i];

            String firstchar = word.substring(0, 1).toUpperCase();
            String remainingcharString = word.substring(1).toLowerCase();

            result = result + firstchar + remainingcharString;
        }

        System.out.println(result);
    }
}

class UsingArrayListSubstringCamelCaseConversion {
    public static void UsingArrayListSubstringCamelCaseConversionMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String firstWord = list.get(0);
        String result = "";
        result = result + firstWord;

        for (int i = 1; i < list.size(); i++) {
            String word = list.get(i);

            String firstChar = word.substring(0, 1).toUpperCase();
            String remainingString = word.substring(1).toLowerCase();

            result = result + firstChar + remainingString;
        }
        System.out.println(result);
    }
}

public class CamelCaseConversion {
    public static void main(String[] args) {
        UsingSubstringCamelCaseConversion.UsingSubstringCamelCaseConversionMethods("java selenium testing");
        UsingArrayListSubstringCamelCaseConversion
                .UsingArrayListSubstringCamelCaseConversionMethods("java selenium testing");
    }
}
