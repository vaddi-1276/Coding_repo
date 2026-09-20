package Strings;

import java.util.ArrayList;

// Input: programming
// Output: o, a, i

class UsingForLoopPrintVowelsinOrder {
    public static void UsingForLoopPrintVowelsinOrderMethods(String str) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            boolean found = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == vowels[i]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(vowels[i]);
            }
        }
        System.out.println();
    }
}

class UsingArrayListPrintVowelsinOrder {
    public static void UsingArrayListPrintVowelsinOrderMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < vowels.length; i++) {
            boolean found = false;
            for (int j = 0; j < list.size(); j++) {
                if (vowels[i] == list.get(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(vowels[i]);
            }
        }
        System.out.println();
    }
}

class UsingRecursionPrintVowelsinOrder {
    public static void UsingRecursionPrintVowelsinOrderMethods(String str, int index) {

        if (index == str.length()) {
            return;
        }
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            if (str.charAt(index) == vowels[i]) {
                System.out.println(str.charAt(index));
            }
        }
        UsingRecursionPrintVowelsinOrderMethods(str, index + 1);
    }
}

public class PrintVowelsinOrder {
    public static void main(String[] args) {
        UsingForLoopPrintVowelsinOrder.UsingForLoopPrintVowelsinOrderMethods("programming");
        UsingArrayListPrintVowelsinOrder.UsingArrayListPrintVowelsinOrderMethods("programming");
        UsingRecursionPrintVowelsinOrder.UsingRecursionPrintVowelsinOrderMethods("programming", 0);
    }
}
