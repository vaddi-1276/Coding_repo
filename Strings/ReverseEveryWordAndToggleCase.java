package Strings;

// Input:
// Java Selenium Testing

// Output:
// AVAj MUINELEs GNITSEt

class UsingchReverseEveryWordAndToggleCase {
    public static void UsingchReverseEveryWordAndToggleCaseMethods(String str) {

        String words[] = str.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseString = reverseString + words[i].charAt(j);
            }
            reverseString = reverseString + " ";
        }
        // System.out.println(reverseString);

        String finalvalue = "";

        for (int i = 0; i < reverseString.length(); i++) {
            char ch = reverseString.charAt(i);

            if (ch == ' ') {
                finalvalue = finalvalue + ' ';
            } else if (ch >= 'A' && ch <= 'Z') {
                finalvalue = finalvalue + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                finalvalue = finalvalue + (char) (ch - 32);
            }

        }
        System.out.println(finalvalue);
    }
}

class UsingStringBuilderReverseEveryWordAndToggleCase {
    public static void UsingStringBuilderReverseEveryWordAndToggleCaseMethods(String str) {

        String words[] = str.split(" ");
        String result = "";
        String finalvalue = "";
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse() + " ";
        }
        for (int i = 0; i < result.length(); i++) {

            char ch = result.charAt(i);

            if (ch == ' ') {
                finalvalue = finalvalue + ' ';
            }

            else if (Character.isLowerCase(ch)) {
                finalvalue = finalvalue + Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                finalvalue = finalvalue + Character.toLowerCase(ch);
            }
        }
        System.out.println(finalvalue);
    }
}

public class ReverseEveryWordAndToggleCase {
    public static void main(String[] args) {
        UsingchReverseEveryWordAndToggleCase.UsingchReverseEveryWordAndToggleCaseMethods("Java Selenium Testing");
        UsingStringBuilderReverseEveryWordAndToggleCase
                .UsingStringBuilderReverseEveryWordAndToggleCaseMethods("Java Selenium Testing");
    }
}
