package Strings;

import java.util.ArrayList;

// Input: 1122334455

// Output:
// 1 = 2
// 2 = 2
// 3 = 2
// 4 = 2
// 5 = 2

class UsingNestedForLoopCountOccurrencesofEachDigit {
    public static void UsingNestedForLoopCountOccurrencesofEachDigitMethods(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}

class UsingArrayListCountOccurrencesofEachDigit {
    public static void UsingArrayListCountOccurrencesofEachDigitMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(k) == list.get(i)) {
                    count++;
                }
            }
            System.out.println(list.get(i) + " = " + count);
        }
    }
}

public class CountOccurrencesofEachDigit {
    public static void main(String[] args) {
        UsingNestedForLoopCountOccurrencesofEachDigit
                .UsingNestedForLoopCountOccurrencesofEachDigitMethods("111222333444555");
        UsingArrayListCountOccurrencesofEachDigit
                .UsingArrayListCountOccurrencesofEachDigitMethods("11112222333344445555");
    }
}
