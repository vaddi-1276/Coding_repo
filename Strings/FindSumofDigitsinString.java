package Strings;

// Input: Java123Testing45
// Output: 15

class UsingNestedForLoopFindSumofDigitsinString {
    public static void UsingNestedForLoopFindSumofDigitsinStringMethods(String str) {

        String onlydigit = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                onlydigit = onlydigit + ch;
            }
        }
        int sum = 0;
        for (int i = 0; i < onlydigit.length(); i++) {
            char ch = onlydigit.charAt(i);
            sum = sum + ch - '0';
        }
        System.out.println(sum);
    }
}

class UsingRecursionFindSumofDigitsinString {
    public static void UsingRecursionFindSumofDigitsinStringMethods(String str, int index, String onlydigit, int sum) {
        if (index == str.length()) {
            System.out.println(sum);
            return;
        }
        char ch = str.charAt(index);
        if (Character.isDigit(ch)) {
            onlydigit = onlydigit + ch;
            sum=sum+ch-'0';
        }
        UsingRecursionFindSumofDigitsinStringMethods(str, index + 1, onlydigit, sum);
    }
}

public class FindSumofDigitsinString {
    public static void main(String[] args) {
        UsingNestedForLoopFindSumofDigitsinString
                .UsingNestedForLoopFindSumofDigitsinStringMethods("Java123Testing45");
        UsingRecursionFindSumofDigitsinString.UsingRecursionFindSumofDigitsinStringMethods("Java123Testing45",
         0, "",
                0);
    }
}
