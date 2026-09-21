package Strings;

// Input: BAD
// Output: A = 65

class UsingForLoopFindCharacterWithLowestASCIIValue {
    public static void UsingForLoopFindCharacterWithLowestASCIIValueMethods(String str) {

        int minimumvalue = Integer.MAX_VALUE;
        char minimumchar = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((int) ch < minimumvalue) {
                minimumvalue = (int) ch;
                minimumchar = ch;
            }
        }
        System.out.println(minimumchar + " = " + minimumvalue);
    }
}

class UsingRecursionFindCharacterWithLowestASCIIValue {
    public static void UsingRecursionFindCharacterWithLowestASCIIValueMethods(String str, int index, int minimumvalue,
            char minimumchar) {

        if (index == str.length()) {
            System.out.println(minimumchar + " = " + minimumvalue);
            return;
        }
        char ch = str.charAt(index);

        if ((int) ch < minimumvalue) {
            minimumvalue = (int) ch;
            minimumchar = ch;
        }
        UsingRecursionFindCharacterWithLowestASCIIValueMethods(str, index + 1, minimumvalue, minimumchar);
    }
}

public class FindCharacterWithLowestASCIIValue {
    public static void main(String[] args) {
        UsingForLoopFindCharacterWithLowestASCIIValue.UsingForLoopFindCharacterWithLowestASCIIValueMethods("CDE");
        UsingRecursionFindCharacterWithLowestASCIIValue.UsingRecursionFindCharacterWithLowestASCIIValueMethods("BCDE",
                0, Integer.MAX_VALUE, ' ');
    }
}
