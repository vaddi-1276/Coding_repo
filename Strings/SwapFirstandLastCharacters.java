package Strings;

// Input: Java
// Output: aavJ

class UsingForLoopSwapFirstandLastCharacters {
    public static void UsingForLoopSwapFirstandLastCharactersMethods(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                result = result + str.charAt(str.length() - 1);
            }

            else if (i == str.length() - 1) {
                result = result + str.charAt(0);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
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

        // String str = "Java";
        // UsingRecursionSwapFirstandLastCharacters.UsingRecursionSwapFirstandLastCharactersMethods(str,
        // 0, "",
        // str.charAt(0), str.charAt(str.length() - 1));
    }
}
