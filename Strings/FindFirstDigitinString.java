package Strings;

// Input: Java123Testing
// Output: 1

class UsingCharFunctionsFindFirstDigitinString {
    public static void UsingCharFunctionsFindFirstDigitinStringMethods(String str) {

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                System.out.println(ch);
                break;
            }
        }
    }
}

class UsingRecursionFindFirstDigitinString {
    public static void UsingRecursionFindFirstDigitinStringMethods(String str, int index, String finalvalueString) {

        if (index == str.length()) {
            return;
        }
        char ch = str.charAt(index);
        if (Character.isDigit(ch)) {
            finalvalueString = finalvalueString + ch;
            System.out.println(finalvalueString.charAt(0));
            return;
        }
        UsingRecursionFindFirstDigitinStringMethods(str, index + 1, finalvalueString);
    }
}

public class FindFirstDigitinString {
    public static void main(String[] args) {
        UsingCharFunctionsFindFirstDigitinString.UsingCharFunctionsFindFirstDigitinStringMethods("Java123Testing");
        //UsingRecursionFindFirstDigitinString.UsingRecursionFindFirstDigitinStringMethods("Java123Testing", 0, "");
    }
}
