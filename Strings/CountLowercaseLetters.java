package Strings;

import java.util.ArrayList;

// Input: Java SELENIUM Testing

// Output: Lowercase = 9

class UsingCharCountLowercaseLetters {
    public static void UsingCharCountLowercaseLettersMethods(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.println("Lower Case = " + count);
    }
}

class UsingArrayListCountLowercaseLetters {
    public static void UsingArrayListCountLowercaseLettersMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.println("Lower Case = " + count);
    }
}

class UsingRecursionCountLowercaseLetters {
    public static void UsingRecursionCountLowercaseLettersMethods(String str, int index, int count) {

        if (index == str.length()) {
            System.out.println("Lower Case = " + count);
            return;
        }
        char ch = str.charAt(index);
        if (ch >= 'a' && ch <= 'z') {
            count++;
        }
        UsingRecursionCountLowercaseLettersMethods(str, index + 1, count);
    }
}

public class CountLowercaseLetters {
    public static void main(String[] args) {
        UsingCharCountLowercaseLetters.UsingCharCountLowercaseLettersMethods("Java SELENIUM Testing");
        UsingArrayListCountLowercaseLetters.UsingArrayListCountLowercaseLettersMethods("Java SELENIUM Testing");
        UsingRecursionCountLowercaseLetters.UsingRecursionCountLowercaseLettersMethods("Java SELENIUM Testing", 0, 0);
    }
}
