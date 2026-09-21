package Strings;

// Input: Java@123#Selenium!

// Output: Special Characters = 3

class UsingCharCountSpecialCharacters {
    public static void UsingCharCountSpecialCharactersMethods(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9')) {
                count++;
            }
        }
        System.out.println("Special Characters = " + count);
    }
}

class UsingCharacterCountSpecialCharacters {
    public static void UsingCharacterCountSpecialCharactersMethods(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(Character.isLetterOrDigit(ch))) {
                count++;
            }
        }
        System.out.println("Special Characters = " + count);
    }
}

class UsingRecursionCountSpecialCharacters {
    public static void UsingRecursionCountSpecialCharactersMethods(String str, int index, int count) {

        if (index == str.length()) {
            System.out.println("Special Characters = " + count);
            return;
        }
        char ch = str.charAt(index);
        if (!(Character.isLetterOrDigit(ch))) {
            count++;
        }

        UsingRecursionCountSpecialCharactersMethods(str, index + 1, count);
    }
}

public class CountSpecialCharacters {
    public static void main(String[] args) {
        UsingCharCountSpecialCharacters.UsingCharCountSpecialCharactersMethods("Java@123#Selenium!");
        UsingCharacterCountSpecialCharacters.UsingCharacterCountSpecialCharactersMethods("Java@123#Selenium!!@#$%^&*(");
        UsingRecursionCountSpecialCharacters.UsingRecursionCountSpecialCharactersMethods("Java@123#Selenium!!@#$%^&*()",
                0, 0);
    }
}
