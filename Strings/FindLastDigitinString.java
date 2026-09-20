package Strings;

import java.util.ArrayList;

// Input: Java123Testing456
// Output: 6

class UsingCharFunctionsFindLastDigitinString {
    public static void UsingCharFunctionsFindLastDigitinStringMethods(String str) {
        String final_value = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                final_value = final_value + ch;
            }
        }
        System.out.println(final_value.charAt(final_value.length() - 1));
    }
}

class UsingArrayListFindLastDigitinString {
    public static void UsingArrayListFindLastDigitinStringMethods(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        StringBuilder finalvalue = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= '0' && list.get(i) <= '9') {
                finalvalue.append(list.get(i));
            }
        }
        System.out.println(finalvalue.charAt(finalvalue.length() - 1));
    }
}

class UsingRecursionFindLastDigitinString
{
    public static void UsingRecursionFindLastDigitinStringMethods(String str,int index,String finalvalue) {
        
        if(index==str.length())
        {
            System.out.println(finalvalue.charAt(finalvalue.length()-1));
            return;
        }
        char ch=str.charAt(index);
        if(Character.isDigit(ch))
        {
            finalvalue=finalvalue+ch;
        }
        UsingRecursionFindLastDigitinStringMethods(str, index+1, finalvalue);
    }
}
public class FindLastDigitinString {
    public static void main(String[] args) {
        UsingCharFunctionsFindLastDigitinString.UsingCharFunctionsFindLastDigitinStringMethods("Java123Testing456");
        UsingArrayListFindLastDigitinString.UsingArrayListFindLastDigitinStringMethods("Java123Testing456");
        UsingRecursionFindLastDigitinString.UsingRecursionFindLastDigitinStringMethods("Java123Testing456", 0, " ");
    }
}
