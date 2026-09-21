package Strings;

// Input: Selenium
// Output: Slnu

class UsingNestedForLoopPrintCharactersatEvenPositions {
    public static void UsingNestedForLoopPrintCharactersatEvenPositionsMethods(String str) {

        String finalvalue = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                finalvalue = finalvalue + str.charAt(i);
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingRecursionPrintCharactersatEvenPositions {
    public static void UsingRecursionPrintCharactersatEvenPositionsMethods(String str, int index,
            String finalvalueString) {

        if (index == str.length()) {
            System.out.println(finalvalueString);
            return;
        }

        char ch = str.charAt(index);
        if (index % 2 == 0) {
            finalvalueString = finalvalueString + ch;
        }
        UsingRecursionPrintCharactersatEvenPositionsMethods(str, index + 1, finalvalueString);
    }
}

public class PrintCharactersatEvenPositions {
    public static void main(String[] args) {
        UsingNestedForLoopPrintCharactersatEvenPositions
                .UsingNestedForLoopPrintCharactersatEvenPositionsMethods("Selenium");
        UsingRecursionPrintCharactersatEvenPositions.UsingRecursionPrintCharactersatEvenPositionsMethods("Selenium", 0,
                "");
    }
}
