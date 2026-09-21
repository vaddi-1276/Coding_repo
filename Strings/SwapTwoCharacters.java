package Strings;

// Input: Java
// Positions = 0, 2

//Output: vaJa

class UsingForLoopSwapTwoCharacters {
    public static void UsingForLoopSwapTwoCharactersMethods(String str, int firstposition, int secondposition) {

        char firstpositionchar = str.charAt(firstposition);
        char secondpositionchar = str.charAt(secondposition);
        String finalvalue = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == firstposition) {
                finalvalue = finalvalue + secondpositionchar;
            } else if (i == secondposition) {
                finalvalue = finalvalue + firstpositionchar;
            } else {
                finalvalue = finalvalue + ch;
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionSwapTwoCharacters {
    public static void UsingRecursionSwapTwoCharactersMethods(String str, String finalvalue, int index,
            int firstposition, int secondposition, char firstpositionchar, char secondpositionchar) {

        if (index == str.length()) {
            System.out.println(finalvalue);
            return;
        }
        char ch = str.charAt(index);
        if (index == firstposition) {
            finalvalue = finalvalue + secondpositionchar;
        } else if (index == secondposition) {
            finalvalue = finalvalue + firstpositionchar;
        } else {
            finalvalue = finalvalue + ch;
        }
        UsingRecursionSwapTwoCharactersMethods(str, finalvalue, index + 1, firstposition, secondposition,
                firstpositionchar, secondpositionchar);
    }
}

public class SwapTwoCharacters {
    public static void main(String[] args) {
        UsingForLoopSwapTwoCharacters.UsingForLoopSwapTwoCharactersMethods("Java", 0, 2);

        String str = "Java";
        UsingRecursionSwapTwoCharacters.UsingRecursionSwapTwoCharactersMethods(str, "", 0, 0, 2, str.charAt(0),
                str.charAt(2));
    }
}
