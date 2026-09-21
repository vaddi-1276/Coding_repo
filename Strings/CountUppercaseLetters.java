package Strings;

import java.util.ArrayList;

// Input: Java SELENIUM Testing
// Output: Uppercase = 8

class UsingCharCountUppercaseLetters {
    public static void UsingCharCountUppercaseLettersMethods(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println("Uppercase = " + count);
    }
}

class UsingArrayListCountUppercaseLetters {
    public static void UsingArrayListCountUppercaseLettersMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println("Uppercase = " + count);
    }
}

class UsingRecursionCountUppercaseLetters
{
    public static void UsingRecursionCountUppercaseLettersMethods(String str,int index,int count) {
        if(index==str.length())
        {
            System.out.println("Uppercase = "+count);
            return;
        }

        char ch=str.charAt(index);

        if(ch>='A' && ch<='Z')
        {
            count++;
        }
        UsingRecursionCountUppercaseLettersMethods(str, index+1,count);
    }
}



public class CountUppercaseLetters {
    public static void main(String[] args) {
        UsingCharCountUppercaseLetters.UsingCharCountUppercaseLettersMethods("Java SELENIUM Testing");
        UsingArrayListCountUppercaseLetters.UsingArrayListCountUppercaseLettersMethods("Java SELENIUM Testing");
        UsingRecursionCountUppercaseLetters.UsingRecursionCountUppercaseLettersMethods("Java SELENIUM Testing", 0,0);
    }
}
