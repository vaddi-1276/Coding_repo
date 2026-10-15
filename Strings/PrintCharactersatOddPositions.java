package Strings;

// Input: Selenium
// Output: eeim

class UsingNestedForLoopPrintCharactersatOddPositions {
    public static void UsingNestedForLoopPrintCharactersatOddPositionsMethods(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}

class UsingRecursionPrintCharactersatOddPositions {
    public static void UsingRecursionPrintCharactersatOddPositionsMethods(String str, int index,
            String finalvalueString) {

        if (index == str.length()) {
            System.out.println(finalvalueString);
            return;
        }
        if (index % 2 != 0) {
            finalvalueString = finalvalueString + str.charAt(index);
        }
        UsingRecursionPrintCharactersatOddPositionsMethods(str, index + 1, finalvalueString);
    }
}

public class PrintCharactersatOddPositions {
    public static void main(String[] args) {
        UsingNestedForLoopPrintCharactersatOddPositions
                .UsingNestedForLoopPrintCharactersatOddPositionsMethods("Selenium");

        // UsingRecursionPrintCharactersatOddPositions.UsingRecursionPrintCharactersatOddPositionsMethods("Selenium",
        // 0,
        // "");
    }
}
