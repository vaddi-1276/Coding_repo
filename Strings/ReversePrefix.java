package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef
// N = 3

// Output:
// cbadef

class ReversePrefixUsingLoop {

    public static void reverseUsingLoop(String str) {

        int n = 3;
        String result = "";
        for (int i = n - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        for (int i = n; i < str.length(); i++) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}

class ReversePrefixUsingSubstring
{
    public static void reverseUsingSubstring(String str) {
        
        int n=3;
        String result=str.substring(0, n)+new StringBuilder(str.substring(n)).reverse();
        System.out.println(result);
    }
}

class ReversePrefixUsingArrayList
{
    public static void reverseUsingArrayList(String str) {
        ArrayList<Character>list=new ArrayList<>();
        int n=3;
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        ArrayList<Character>after_the_NPosition=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            after_the_NPosition.add(str.charAt(i));
        }
        Collections.reverse(after_the_NPosition);

        StringBuilder result=new StringBuilder();
        int index=0;
        for(int i=0;i<n;i++)
        {
            result.append(after_the_NPosition.get(index++));
        }
        for(int i=n;i<list.size();i++)
        {
            result.append(list.get(i));
        }
        System.out.println(result);
    }
}
public class ReversePrefix {
    public static void main(String[] args) {
        ReversePrefixUsingLoop.reverseUsingLoop("abcdef");
        ReversePrefixUsingSubstring.reverseUsingSubstring("12345678");
        ReversePrefixUsingArrayList.reverseUsingArrayList("abcdef");
    }
}
