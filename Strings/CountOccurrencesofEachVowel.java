package Strings;

// Input: education

// Output:
// a = 1
// e = 1
// i = 1
// o = 1
// u = 1

class UsingNestedForLoopCountOccurrencesofEachVowel {
    public static void UsingNestedForLoopCountOccurrencesofEachVowelMethods(String str) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(j) == vowels[i]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(vowels[i] + " = " + count);
            }
        }
    }
}

class UsingForLoopCountOccurrencesofEachVowel {
    public static void UsingForLoopCountOccurrencesofEachVowelMethods(String str) {

        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                a_count++;
            } else if (ch == 'e') {
                e_count++;
            } else if (ch == 'i') {
                i_count++;
            } else if (ch == 'o') {
                o_count++;
            } else if (ch == 'u') {
                u_count++;
            }
        }
        System.out.println("a = " + a_count);
        System.out.println("e = " + e_count);
        System.out.println("i = " + i_count);
        System.out.println("o = " + o_count);
        System.out.println("u = " + u_count);
    }
}

class UsingRecursionCountOccurrencesofEachVowel {
    public static void UsingRecursionCountOccurrencesofEachVowelMethods(String str, int index) {

        char ch[] = { 'a', 'e', 'i', 'o', 'u' };

        if (index == ch.length) {
            return;
        }
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch[index]) {
                count++;
            }
        }
        System.out.println(ch[index] + " = " + count);

        UsingRecursionCountOccurrencesofEachVowelMethods(str, index + 1);
    }
}

public class CountOccurrencesofEachVowel {
    public static void main(String[] args) {
        UsingNestedForLoopCountOccurrencesofEachVowel
                .UsingNestedForLoopCountOccurrencesofEachVowelMethods("education");
        // UsingForLoopCountOccurrencesofEachVowel.UsingForLoopCountOccurrencesofEachVowelMethods("aeiouaeiou");
        // UsingRecursionCountOccurrencesofEachVowel.UsingRecursionCountOccurrencesofEachVowelMethods("aeiouaeiouaeiou",
        // 0);
    }
}
