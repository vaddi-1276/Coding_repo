package Strings;

import java.util.ArrayList;

// Input:
// java selenium testing

// Output:
// JavaSeleniumTesting

class UsingForLoopSubstringPascalCaseConversion {
    public static void UsingForLoopSubstringPascalCaseConversionMethods(String str) {
        String words[] = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String wordString = words[i];
            result = result + wordString.substring(0, 1).toUpperCase() + wordString.substring(1).toLowerCase();
        }
        System.out.println(result);
    }
}

class UsingArrayListPascalCaseConversion {
    public static void UsingArrayListPascalCaseConversionMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            result.append(word.substring(0, 1).toUpperCase());
            result.append(word.substring(1).toLowerCase());
        }
        System.out.println(result);
    }
}

public class PascalCaseConversion {
    public static void main(String[] args) {
        UsingForLoopSubstringPascalCaseConversion
                .UsingForLoopSubstringPascalCaseConversionMethods("java selenium testing");
        // UsingArrayListPascalCaseConversion.UsingArrayListPascalCaseConversionMethods("java
        // selenium testing");
    }
}
