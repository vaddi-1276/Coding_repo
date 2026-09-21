package Strings;

// Input: BAD
// Output: D = 68

class UsingForLoopFindCharacterWithHighestASCIIValue {
    public static void UsingForLoopFindCharacterWithHighestASCIIValueMethods(String str) {

        int highestasciivalue = Integer.MIN_VALUE;
        char highestasciiletter = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((int) ch > highestasciivalue) {
                highestasciivalue = (int) ch;
                highestasciiletter = str.charAt(i);
            }
        }
        System.out.println(highestasciiletter + " = " + highestasciivalue);
    }
}

class UsingRecursionFindCharacterWithHighestASCIIValue {
    public static void UsingRecursionFindCharacterWithHighestASCIIValueMethods(String str, int index,
            int highestasciivalue, char highestasciiletter) {

        if (index == str.length()) {
            System.out.println(highestasciiletter + " = " + highestasciivalue);
            return;
        }

        char ch = str.charAt(index);
        if ((int) ch > highestasciivalue) {
            highestasciivalue = (int) ch;
            highestasciiletter = ch;
        }
        UsingRecursionFindCharacterWithHighestASCIIValueMethods(str, index + 1, highestasciivalue, highestasciiletter);
    }
}

public class FindCharacterWithHighestASCIIValue {
    public static void main(String[] args) {
        UsingForLoopFindCharacterWithHighestASCIIValue.UsingForLoopFindCharacterWithHighestASCIIValueMethods("BAD");
        UsingRecursionFindCharacterWithHighestASCIIValue.UsingRecursionFindCharacterWithHighestASCIIValueMethods("BADE", 0, 0, ' ');
    }
}
