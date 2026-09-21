package Strings;

// Input: Java
// Output: aavJ

class UsingForLoopSwapFirstandLastCharacters {
    public static void UsingForLoopSwapFirstandLastCharactersMethods(String str) {

        char firstchar = str.charAt(0);
        char lastchar = str.charAt(str.length() - 1);
        String finalvalue = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (i == 0) {
                finalvalue = finalvalue + lastchar;
            } else if (i == str.length() - 1) {
                finalvalue = finalvalue + firstchar;
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionSwapFirstandLastCharacters {
    public static void UsingRecursionSwapFirstandLastCharactersMethods(String str, int index, String finalvalue,
            char firstchar, char lastchar) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }

        char ch = str.charAt(index);
        if (index == 0) {
            finalvalue = finalvalue + lastchar;
        } else if (index == str.length() - 1) {
            finalvalue = finalvalue + firstchar;
        } else {
            finalvalue = finalvalue + ch;
        }
        UsingRecursionSwapFirstandLastCharactersMethods(str, index + 1, finalvalue, firstchar, lastchar);
    }
}

public class SwapFirstandLastCharacters {
    public static void main(String[] args) {
        UsingForLoopSwapFirstandLastCharacters.UsingForLoopSwapFirstandLastCharactersMethods("Java");

        String str = "Java";
        UsingRecursionSwapFirstandLastCharacters.UsingRecursionSwapFirstandLastCharactersMethods(str, 0, "",
                str.charAt(0), str.charAt(str.length() - 1));
    }
}
