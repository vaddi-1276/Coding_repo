package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// listen
// silent

// Output:
// Frequency Match = Yes
// Anagram = Yes

class UsingArraysSortCheckAnagramFrequencyMatch {
    public static void UsingArraysSortCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram because Lengths are not Equal");
            return;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Not Anagram because values are not Equal");
                return;
            }

        }
        System.out.println("Anagram");
    }
}

class UsingRecursionCheckAnagramFrequencyMatch {
    public static void UsingRecursionCheckAnagramFrequencyMatchMethods(char arr1[], char arr2[], int index) {

        if (arr1.length != arr2.length) {
            System.out.println("Not Anagram because Length are not Equal");
            return;
        }

        if (index == arr1.length) {
            System.out.println("Anagram");
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1[index] != arr2[index]) {
            System.out.println("Not Anagram because Values are not Equal");
            return;
        }
        UsingRecursionCheckAnagramFrequencyMatchMethods(arr1, arr2, index + 1);
    }
}

class UsingArrayListCheckAnagramFrequencyMatch {
    public static void UsingArrayListCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Frequency Match = Yes");
        System.out.println("Anagram = Yes");
    }
}

public class CheckAnagramFrequencyMatch {
    public static void main(String[] args) {
        UsingArraysSortCheckAnagramFrequencyMatch.UsingArraysSortCheckAnagramFrequencyMatchMethods("listen",
                "appear");

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        String str1 = "listen";
        String str2 = "appear";

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        UsingRecursionCheckAnagramFrequencyMatch.UsingRecursionCheckAnagramFrequencyMatchMethods(arr1, arr2, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingArrayListCheckAnagramFrequencyMatch.UsingArrayListCheckAnagramFrequencyMatchMethods("listen",
        // "silent");
    }
}
