package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// JavaSelenium

// Output:
// JmuineleSava

class ReverseOnlyLowercaseLettersUsingForLoop {
    public static void ReverseOnlyLowercaseLettersUsingForLoopMethods(String str) {

        String lowercaseString = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lowercaseString = lowercaseString + ch;
            }
        }
        String reverse_lowercaseString = "";
        for (int i = lowercaseString.length() - 1; i >= 0; i--) {
            reverse_lowercaseString = reverse_lowercaseString + lowercaseString.charAt(i);
        }

        int index = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + reverse_lowercaseString.charAt(index++);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverse {
    public static void ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverseMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ArrayList<Character> lowercaseString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'a' && ch <= 'z') {
                lowercaseString.add(ch);
            }
        }

        Collections.reverse(lowercaseString);
        System.out.println(lowercaseString);

        StringBuilder result=new StringBuilder();
        int index=0;

        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);

             if (ch >= 'a' && ch <= 'z')
             {
                result.append(lowercaseString.get(index++));
             }
             else{
                result.append(ch);
             }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyLowercaseLetters {
    public static void main(String[] args) {
        ReverseOnlyLowercaseLettersUsingForLoop.ReverseOnlyLowercaseLettersUsingForLoopMethods("Java Selenium");
        ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverse
                .ReverseOnlyLowercaseLettersUsingArrayListCollectionsReverseMethods("Java Selenium");
    }
}
