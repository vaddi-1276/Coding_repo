package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// Java

// Output:
// avaJ


class ReverseUsingLoop{

    public static void reverseUsingLoop(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}

class ReverseUsingStringBuilder
{
    public static void reverseUsingStringBuilder(String str)
    {
        String reverse=new StringBuilder(str).reverse().toString();

        System.out.println(reverse);

    }
}

class ReverseUsingArrayList
{
    public static void reverseUsingArrayList(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

       StringBuilder result=new StringBuilder();
       for(int i=list.size()-1;i>=0;i--)
       {
        result.append(list.get(i));
       }
       System.out.println(result);
    }
}

class ReverseUsingCollections
{
    public static void reverseUsingCollections(String str)
    {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);

        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            result.append(list.get(i));
        }
        System.out.println(result);
    }
}
public class StringReversal {
    
    public static void main(String[] args) {
        ReverseUsingLoop.reverseUsingLoop("Java");
        ReverseUsingStringBuilder.reverseUsingStringBuilder("Python");
        ReverseUsingArrayList.reverseUsingArrayList("Ruby");
        ReverseUsingCollections.reverseUsingCollections("Appium");
    }
}
