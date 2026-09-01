package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java Selenium

// Output:
// Sava Jelenium

class ReverseOnlyUppercaseLettersUsingForLoop {
    public static void ReverseOnlyLowercaseLettersUsingForLoopMethods(String str) {

        String onlycapitalCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                onlycapitalCharacters = onlycapitalCharacters + ch;
            }
        }
        String reverseonlycapitalCharacters = "";
        for (int i = onlycapitalCharacters.length() - 1; i >= 0; i--) {
            reverseonlycapitalCharacters = reverseonlycapitalCharacters + onlycapitalCharacters.charAt(i);
        }

        int index=0;
        String result="";

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z')
            {
                result=result+reverseonlycapitalCharacters.charAt(index++);
            }
            else{
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}

class ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverse {
    public static void ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverseMethods(String str) {

        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        ArrayList<Character>onlyUppercasecharacters=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);

            if(ch>='A' && ch<='Z')
            {
                onlyUppercasecharacters.add(ch);
            }
        }
        Collections.reverse(onlyUppercasecharacters);

        int index=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);

            if(ch>='A' && ch<='Z')
            {
                result.append(onlyUppercasecharacters.get(index++));
            }

            else{
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ReverseOnlyUppercaseLetters {
    public static void main(String[] args) {
       ReverseOnlyUppercaseLettersUsingForLoop.ReverseOnlyLowercaseLettersUsingForLoopMethods("Java Selenium");
        ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverse
        .ReverseOnlyUppercaseLettersUsingArrayListCollectionsReverseMethods("Java Selenium");
    }
}
