package Strings;

// Input: 123456
// Output: Yes

class UsingCharCheckStringContainsOnlyDigits {
    public static void UsingCharCheckStringContainsOnlyDigitsMethods(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class UsingCharacterCheckStringContainsOnlyDigits {
    public static void UsingCharacterCheckStringContainsOnlyDigitsMethods(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(Character.isDigit(ch))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class UsingRecursionCheckStringContainsOnlyDigits {
    public static void UsingRecursionCheckStringContainsOnlyDigitsMethods(String str, int index) {

        if (index == str.length()) {
            System.out.println("Yes");
            return;
        }

        char ch = str.charAt(index);
        if (!(Character.isDigit(ch))) {
            System.out.println("No");
            return;
        }
        UsingRecursionCheckStringContainsOnlyDigitsMethods(str, index + 1);
    }
}

public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        UsingCharCheckStringContainsOnlyDigits.UsingCharCheckStringContainsOnlyDigitsMethods("123456!!!!@@#$");
        UsingCharacterCheckStringContainsOnlyDigits.UsingCharacterCheckStringContainsOnlyDigitsMethods("12345678QWER");
        UsingRecursionCheckStringContainsOnlyDigits.UsingRecursionCheckStringContainsOnlyDigitsMethods("12345678QW", 0);
    }
}
