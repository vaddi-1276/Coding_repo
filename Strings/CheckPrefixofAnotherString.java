package Strings;

// Input: Selenium
// Sele

// Output: Yes

class UsingStartsWithCheckPrefixofAnotherString {
    public static void UsingStartsWithCheckPrefixofAnotherStringMethods(String str, String prefixString) {

        if (str.startsWith(prefixString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class UsingNestedForLoopCheckPrefixofAnotherString {
    public static void UsingNestedForLoopCheckPrefixofAnotherStringMethods(String str, String prefixString) {

        if (str.length() >= prefixString.length() && str.substring(0, prefixString.length()).equals(prefixString)) {
            System.out.println("Yes");
        } else {
            System.err.println("No");
        }
    }
}

class UsingRecursionCheckPrefixofAnotherString {
    public static void UsingRecursionCheckPrefixofAnotherStringMethods(String str, String prefixString, int index) {

        if (index == str.length()) {
            return;
        }
        if (str.length() >= prefixString.length() && str.substring(0, prefixString.length()).equals(prefixString)) {
            System.out.println("Yes");
            return;
        } else {
            System.out.println("No");
        }
        UsingRecursionCheckPrefixofAnotherStringMethods(str, prefixString, index + 1);
    }
}

public class CheckPrefixofAnotherString {
    public static void main(String[] args) {
        // UsingStartsWithCheckPrefixofAnotherString.UsingStartsWithCheckPrefixofAnotherStringMethods("Selenium",
        // "playwright");
        // UsingNestedForLoopCheckPrefixofAnotherString.UsingNestedForLoopCheckPrefixofAnotherStringMethods("Selenium",
        // "Selepri");
        UsingRecursionCheckPrefixofAnotherString
                .UsingRecursionCheckPrefixofAnotherStringMethods("Selenium", "Selep", 0);
    }
}
