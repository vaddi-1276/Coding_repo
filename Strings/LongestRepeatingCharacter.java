package Strings;

import java.util.ArrayList;

// Input:
// aaabbccccdd

// Output:
// c = 4

class UsingNestedForLoopLongestRepeatingCharacter {
    public static void UsingNestedForLoopLongestRepeatingCharacterMethods(String str) {

        int maxCount = 0;
        char maxchar = '\0';

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

            if (count > maxCount) {
                maxCount = count;
                maxchar = str.charAt(i);
            }
        }

        System.out.println(maxchar + " = " + maxCount);
    }
}

class UsingCharArrayForLoopLongestRepeatingCharacter {
    public static void UsingCharArrayForLoopLongestRepeatingCharacterMethods(String str) {
        int maxCount = 0;
        char maxchar = '\0';

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxchar = str.charAt(i);
            }
        }
        System.out.println(maxchar + " = " + maxCount);
    }
}

class UsingArrayListLongestRepeatingCharacter {
    public static void UsingArrayListLongestRepeatingCharacterMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int maxCount = 0;
        char maxchar = '\0';

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

            if (count > maxCount) {
                maxCount = count;
                maxchar = list.get(i);
            }
        }
        System.out.println(maxchar + " = " + maxCount);
    }
}

public class LongestRepeatingCharacter {

    public static void main(String[] args) {

        UsingNestedForLoopLongestRepeatingCharacter
                .UsingNestedForLoopLongestRepeatingCharacterMethods(
                        "aaabbccccdd");
        UsingCharArrayForLoopLongestRepeatingCharacter
                .UsingCharArrayForLoopLongestRepeatingCharacterMethods("aaabbccccdd");
        UsingArrayListLongestRepeatingCharacter.UsingArrayListLongestRepeatingCharacterMethods("aaaaaabbccccdd");
    }
}