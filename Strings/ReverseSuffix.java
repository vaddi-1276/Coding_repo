package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef
// N = 3

// Output:
// abcfed

class ReverseSuffixUsingLoop{

    public static void reverseUsingLoop(String str) {
        
        int n=3;
        String result="";
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            result=result+ch;
        }

        for(int i=str.length()-1;i>=n;i--)
        {
            char ch=str.charAt(i);
            result=result+ch;
        }
        System.out.println(result);
    }
}

class ReverseSuffixUsingSubstring
{
    public static void reverseUsingSubstring(String str) {

        int n = 3;
        String result = str.substring(0, n);
        result += new StringBuilder(str.substring(n)).reverse();
        System.out.println(result);
    }
}

class ReverseSuffixUsingArrayList{

    public static void reverseUsingArrayList(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        int n=3;
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        ArrayList<Character>AfterNPosition=new ArrayList<>();
        for(int i=n;i<list.size();i++)
        {
            AfterNPosition.add(list.get(i));
        }
        Collections.reverse(AfterNPosition);

        int index=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            result.append(list.get(i));
        }
        for(int i=n;i<str.length();i++)
        {
            result.append(AfterNPosition.get(index++));
        }

        System.out.println(result);
    }
}

public class ReverseSuffix {
    public static void main(String[] args) {
        ReverseSuffixUsingLoop.reverseUsingLoop("abcdef");
        ReverseSuffixUsingSubstring.reverseUsingSubstring("abcdefg");
        ReverseSuffixUsingArrayList.reverseUsingArrayList("123456");
    }
}
