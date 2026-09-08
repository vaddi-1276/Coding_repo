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
    public static void UsingRecursionAllPossibleSubStringsMethods(String str) {
        find(str, 0);
    }

    public static void find(String str, int start) {

        if (start == str.length()) {
            return;
        }
        String temp=" ";
        for(int i=start;i<str.length();i++)
        {
            temp=temp+str.charAt(i);
            System.out.println(temp);
        }

        find(str, start+1);
    }
}

public class AllPossibleSubStrings {
    public static void main(String[] args) {
        UsingNestedForLoopAllPossibleSubStrings.UsingNestedForLoopAllPossibleSubStringsMethods("ABC");
        UsingSubstringAllPossibleSubStrings.UsingSubstringAllPossibleSubStringsMethods("DEF");
        UsingRecursionAllPossibleSubStrings.UsingRecursionAllPossibleSubStringsMethods("defg");
    }
}
