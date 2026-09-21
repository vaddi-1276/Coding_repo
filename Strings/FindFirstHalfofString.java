package Strings;

// Input: Selenium
// Output: Sele

class UsingForLoopFindFirstHalfofString {
    public static void UsingForLoopFindFirstHalfofStringMethods(String str) {

        int position = str.length() / 2;
        for (int i = 0; i < position; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

class UsingRecursionFindFirstHalfofString {
    public static void UsingRecursionFindFirstHalfofStringMethods(String str, int index, int position) {

        if (index == position) {
            return;
        }
        char ch = str.charAt(index);
        System.out.print(ch);

        UsingRecursionFindFirstHalfofStringMethods(str, index + 1, position);
    }
}

public class FindFirstHalfofString {
    public static void main(String[] args) {
        UsingForLoopFindFirstHalfofString.UsingForLoopFindFirstHalfofStringMethods("Selenium");
        String str = "Selenium";
        UsingRecursionFindFirstHalfofString.UsingRecursionFindFirstHalfofStringMethods(str, 0, str.length() / 2);
        System.out.println();
    }
}
