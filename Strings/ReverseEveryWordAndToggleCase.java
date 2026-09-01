package Strings;

import java.util.ArrayList;

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
        String finalvalue = "";
        for (int i = 0; i < reverseString.length(); i++) {
            char ch = reverseString.charAt(i);

            if (ch == ' ') {
                finalvalue = finalvalue + " ";
            }

            else if (ch >= 'A' && ch <= 'Z') {
                finalvalue = finalvalue + (char) (ch + 32);
            }

            else if (ch >= 'a' && ch <= 'z') {
                finalvalue = finalvalue + (char) (ch - 32);
            }
        }
        System.out.println(finalvalue);
    }
}

class UsingStringBuilderReverseEveryWordAndToggleCase {
    public static void UsingStringBuilderReverseEveryWordAndToggleCaseMethods(String str) {

        String result = "";
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse() + " ";
        }
        String finalvalue = "";
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (ch == ' ') {
                finalvalue = finalvalue + " ";
            }

            else if (Character.isUpperCase(ch)) {
                finalvalue = finalvalue + Character.toLowerCase(ch);
            }

            else if (Character.isLowerCase(ch)) {
                finalvalue = finalvalue + Character.toUpperCase(ch);
            }
        }

        System.out.println(finalvalue);
    }
}

class UsingArrayListReverseEveryWordAndToggleCase {
    public static void UsingArrayListReverseEveryWordAndToggleCaseMethods(String str) {

        ArrayList<String> list = new ArrayList<>();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        System.out.println(list);

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i).length() - 1; j >= 0; j--) {

                char ch = list.get(i).charAt(j);

                if (ch >= 'A' && ch <= 'Z') {
                    result = result + (char) (ch + 32);
                }

                else if (ch >= 'a' && ch <= 'z') {
                    result = result + (char) (ch - 32);
                }
            }
            result = result + " ";
        }
        System.out.println(result);
    }
}

public class ReverseEveryWordAndToggleCase {
    public static void main(String[] args) {
        UsingchReverseEveryWordAndToggleCase.UsingchReverseEveryWordAndToggleCaseMethods("Java Selenium Testing");
        UsingStringBuilderReverseEveryWordAndToggleCase
                .UsingStringBuilderReverseEveryWordAndToggleCaseMethods("Java Selenium Testing");
        UsingArrayListReverseEveryWordAndToggleCase
                .UsingArrayListReverseEveryWordAndToggleCaseMethods("Java Selenium Testing");
    }
}
