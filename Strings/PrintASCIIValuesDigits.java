package Strings;

// Input: 123

// Output: 1 = 49
// 2 = 50
// 3 = 51

class UsingForLoopPrintASCIIValuesDigits {
    public static void UsingForLoopPrintASCIIValuesDigitsMethods(int num) {

        String value = String.valueOf(num);
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }
}

class UsingRecursionPrintASCIIValuesDigits {

    public static void UsingRecursionPrintASCIIValuesDigitsMethods(int num, int index) {

        String value = String.valueOf(num);
        if (index == value.length()) {
            return;
        }
        char ch = value.charAt(index);
        System.out.println(ch + " = " + (int) ch);
        UsingRecursionPrintASCIIValuesDigitsMethods(num, index+1);
    }
}

public class PrintASCIIValuesDigits {
    public static void main(String[] args) {
        UsingForLoopPrintASCIIValuesDigits.UsingForLoopPrintASCIIValuesDigitsMethods(123);
        UsingRecursionPrintASCIIValuesDigits.UsingRecursionPrintASCIIValuesDigitsMethods(456, 0);
    }
}
