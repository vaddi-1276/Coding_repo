package Strings;

// Input: Java
// Positions = 0, 2

//Output: vaJa

class UsingForLoopSwapTwoCharacters {
    public static void UsingForLoopSwapTwoCharactersMethods(String str, int firstposition, int secondposition) {

        char firstpositionchar=str.charAt(firstposition);
        char secondpositionchar=str.charAt(secondposition);

        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(i==firstposition)
            {
                result=result+secondpositionchar;
            }

            else if(i==secondposition)
            {
                result=result+firstpositionchar;
            }
            else
            {
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
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

        // String str = "Java";
        // UsingRecursionSwapTwoCharacters.UsingRecursionSwapTwoCharactersMethods(str, "", 0, 0, 2, str.charAt(0),
        //         str.charAt(2));
    }
}
