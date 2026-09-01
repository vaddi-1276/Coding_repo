package Strings;

import java.util.ArrayList;

// Input:
// java selenium testing

// Output:
// javaSeleniumTesting

class UsingSubstringCamelCaseConversion {
    public static void UsingSubstringCamelCaseConversionMethods(String str) {

        String words[] = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result = result + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
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
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            result = result + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
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
