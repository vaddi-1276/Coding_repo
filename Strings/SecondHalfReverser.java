package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// abcfed

class SecondHalfReversalUsingLoop {
    public static void reverseUsingLoop(String str) {
        int n = str.length() / 2;
        String second_half_String = "";
        for (int i = n; i < str.length(); i++) {
            second_half_String = second_half_String + str.charAt(i);
        }

        String reverse_second_half_String = "";
        for (int j = second_half_String.length() - 1; j >= 0; j--) {
            reverse_second_half_String = reverse_second_half_String + second_half_String.charAt(j);
        }

        String result = "";
        int index=0;
        for (int i = 0; i < n; i++) {
            result = result + str.charAt(i);
        }
        for(int i=n;i<str.length();i++)
        {
            result=result+reverse_second_half_String.charAt(index++);
        }
        System.out.println(result);
    }
}

class SecondHalfReversalUsingArrayList
{
    public static void reverseUsingArrayList(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        int n=list.size()/2;

        String secondhalfString="";
        for(int i=n;i<list.size();i++)
        {
            secondhalfString=secondhalfString+list.get(i);
        }
        String reverse_secondhalfString="";

        for(int i=secondhalfString.length()-1;i>=0;i--)
        {
            reverse_secondhalfString=reverse_secondhalfString+secondhalfString.charAt(i);
        }

        String result="";
        int index=0;

        for(int i=0;i<n;i++)
        {
            result=result+list.get(i);
        }
        for(int j=n;j<list.size();j++)
        {
            result=result+reverse_secondhalfString.charAt(index++);
        }
        System.out.println(result);

    }
}

class SecondHalfReversalUsingCollections
{
    public static void reverseUsingCollections(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        int n=list.size()/2;
        ArrayList<Character>second_half=new ArrayList<>();
        for(int i=n;i<str.length();i++)
        {
            second_half.add(list.get(i));
        }

        Collections.reverse(second_half);
        StringBuilder result=new StringBuilder();
        int index=0;

        for(int i=0;i<n;i++)
        {
            result.append(list.get(i));
        }
        for(int i=n;i<list.size();i++)
        {
            result.append(second_half.get(index++));
        }
        System.out.println(result);
    }
}
public class SecondHalfReverser {
    public static void main(String[] args) {
       SecondHalfReversalUsingLoop.reverseUsingLoop("abcdef");
        SecondHalfReversalUsingArrayList.reverseUsingArrayList("defghi");
        SecondHalfReversalUsingCollections.reverseUsingCollections("ghijkl");
    }
}
