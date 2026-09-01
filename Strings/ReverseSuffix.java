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
        
        int position=3;
        String result="";

        for(int i=0;i<position;i++)
        {
            result=result+str.charAt(i);
        }

        for(int i=str.length()-1;i>=position;i--)
        {
            result=result+str.charAt(i);
        }

        System.out.println(result);
    }
}

class ReverseSuffixUsingSubstring
{
    public static void reverseUsingSubstring(String str) {

       int position=3;

       String result="";
       result=result+str.substring(0, position);
       result=result+new StringBuilder(str.substring(position, str.length())).reverse();

       System.out.println(result);
    }
}

class ReverseSuffixUsingArrayList{

    public static void reverseUsingArrayList(String str) {
        
        int position=3;
        ArrayList<Character>list=new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        ArrayList<Character>reversesuffix=new ArrayList<>();
        for(int i=position;i<list.size();i++)
        {
            reversesuffix.add(str.charAt(i));
        }

        Collections.reverse(reversesuffix);

        int index=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<position;i++)
        {
            result.append(list.get(i));
        }

        for(int i=position;i<list.size();i++)
        {
            result.append(reversesuffix.get(index++));
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
