package Strings;

import java.util.Arrays;

// Input:
// listen
// silent

// Output:
// Frequency Match = Yes
// Anagram = Yes

class UsingNestedForLoopCheckAnagramFrequencyMatch {

    public static void UsingNestedForLoopCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        boolean found = true;
        for (int i = 0; i < str1.length(); i++) {
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count1++;
                }

                if (str1.charAt(i) == str2.charAt(j)) {
                    count2++;
                }
            }

            if (count1 != count2) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Frequency Match= Yes");
            System.out.println("Anagram = Yes");
        } else {
            System.out.println("Frequency Match= No");
            System.out.println("Anagram = No");
        }
    }
}

class UsingArraysSortCheckAnagramFrequencyMatch {
    public static void UsingArraysSortCheckAnagramFrequencyMatchMethods(String str1, String str2) {

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Frequency Match= Yes");
            System.out.println("Anagram = Yes");
        } else {
            System.out.println("Frequency Match= No");
            System.out.println("Anagram = No");
        }
    }
}

public class CheckAnagramFrequencyMatch {
    public static void main(String[] args) {
        UsingNestedForLoopCheckAnagramFrequencyMatch.UsingNestedForLoopCheckAnagramFrequencyMatchMethods("listen",
                "silent");
        UsingArraysSortCheckAnagramFrequencyMatch.UsingArraysSortCheckAnagramFrequencyMatchMethods("listen",
                "silent");
    }
}
