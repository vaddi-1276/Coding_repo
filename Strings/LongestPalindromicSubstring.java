package Strings;

// import java.util.ArrayList;

// Input:
// babad

// Output:
// bab

class UsingForLoopSubstringLongestPalindromicSubstring {
    public static void UsingForLoopSubstringLongestPalindromicSubstringMethods(String str) {
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String subString = str.substring(i, j + 1);
                System.out.println(i + " = " + subString);

                String reverseString = new StringBuilder(subString).reverse().toString();
                System.out.println(i + " = " + reverseString);

                if (subString.equals(reverseString)) {
                    if (subString.length() > longest.length()) {
                        longest = subString;
                    }
                }
            }
        }

        System.out.println(longest);
    }
}

// class UsingArrayListCollectionsReverseLongestPalindromicSubstring {
//     public static void UsingArrayListCollectionsReverseLongestPalindromicSubstringMethods(String str) {

//         ArrayList<Character> list = new ArrayList<>();
//         for (int i = 0; i < str.length(); i++) {
//             list.add(str.charAt(i));
//         }

//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i; j < list.size(); j++) {
//                 String subString="";

//             }
//         }
//     }
// }

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        UsingForLoopSubstringLongestPalindromicSubstring
                .UsingForLoopSubstringLongestPalindromicSubstringMethods("abaabba");
    }
}
