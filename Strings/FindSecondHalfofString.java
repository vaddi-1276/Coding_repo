package Strings;

// Input: Selenium
// Output: nium

class UsingForLoopFindSecondHalfofString {
    public static void UsingForLoopFindSecondHalfofStringMethods(String str) {

        int position = str.length() / 2;
        for (int i = position; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

class UsingRecursionFindSecondHalfofString {
    public static void UsingRecursionFindSecondHalfofStringMethods(String str, int position) {

        if (position == str.length()) {
            return;
        }
        char ch = str.charAt(position);
        System.out.print(ch);
        UsingRecursionFindSecondHalfofStringMethods(str, position + 1);
    }
}

public class FindSecondHalfofString {
    public static void main(String[] args) {
        UsingForLoopFindSecondHalfofString.UsingForLoopFindSecondHalfofStringMethods("Selenium");
        String str = "Selenium";
        UsingRecursionFindSecondHalfofString.UsingRecursionFindSecondHalfofStringMethods(str, str.length() / 2);
        System.out.println();
    }
}
