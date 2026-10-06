package Strings;

import java.util.ArrayList;

// Input:
// java selenium testing

// Output:
// JavaSeleniumTesting

class UsingSubstringCamelCaseConversion {
    public static void UsingSubstringCamelCaseConversionMethods(String str) {

        String words[] = str.split(" ");

        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            result = result + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }

        System.out.println(result);
    }
}

class UsingRecursionCamelCaseConversion {
    public static void UsingRecursionCamelCaseConversionMethods(String str, int index, String result) {

        String words[] = str.split(" ");
        if (index == words.length) {
            System.out.println(result);
            return;
        }

        String word = words[index];

        result = result + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

        UsingRecursionCamelCaseConversionMethods(str, index + 1, result);
    }
}

class UsingArrayListSubstringCamelCaseConversion {
    public static void UsingArrayListSubstringCamelCaseConversionMethods(String str) {
        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        StringBuilder result = new StringBuilder();
        result.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            result.append(list.get(i).substring(0, 1).toUpperCase());
            result.append(list.get(i).substring(1).toLowerCase());
        }
        System.out.println(result);
    }
}

public class CamelCaseConversion {
    public static void main(String[] args) {
        UsingSubstringCamelCaseConversion.UsingSubstringCamelCaseConversionMethods("java selenium testing");

        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        UsingRecursionCamelCaseConversion.UsingRecursionCamelCaseConversionMethods("java selenium testing", 0, "");        


        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        // UsingArrayListSubstringCamelCaseConversion
        // .UsingArrayListSubstringCamelCaseConversionMethods("java python testing");
    }
}
