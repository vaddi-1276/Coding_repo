package Strings;

// Input:
// ABC

// Output:

// A
// AB
// ABC
// B
// BC
// C

class UsingNestedForLoopAllPossibleSubStrings {
    public static void UsingNestedForLoopAllPossibleSubStringsMethods(String str) {

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp = temp + str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}

class UsingSubstringAllPossibleSubStrings {
    public static void UsingSubstringAllPossibleSubStringsMethods(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}

class UsingRecursionAllPossibleSubStrings {

    public static void findAllPossibleSubString(String str, int index) {

        if (index == str.length()) {
            return;
        }

        String temp = "";
        for (int i = index; i < str.length(); i++) {
            temp = temp + str.charAt(i);
            System.out.println(temp);
        }
        findAllPossibleSubString(str, index + 1);
    }
}

public class AllPossibleSubStrings {
    public static void main(String[] args) {
        UsingNestedForLoopAllPossibleSubStrings.UsingNestedForLoopAllPossibleSubStringsMethods("ABC");

        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        UsingSubstringAllPossibleSubStrings.UsingSubstringAllPossibleSubStringsMethods("DEF");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        UsingRecursionAllPossibleSubStrings.findAllPossibleSubString("defg", 0);

        System.out.println(
                "-------------------------------------------------------------------------------------------------");
    }
}
