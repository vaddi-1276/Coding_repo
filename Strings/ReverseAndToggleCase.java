package Strings;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// abcdef

// Output:
// FeDcBa

class ReverseAndToggleUsingLoop {
    public static void transformUsingLoop(String str) {

        String reverse_String = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_String = reverse_String + str.charAt(i);
        }
        String result = "";

        for (int i = 0; i < reverse_String.length(); i++) {
            char ch = reverse_String.charAt(i);
            if (i % 2 == 0) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}

class ReverseAndToggleUsingArrayList {
    public static void transformUsingArrayList(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        Collections.reverse(list);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(result);
    }
}

class ReverseAndToggleUsingASCII
{
    public static void transformUsingASCII(String str) {
        
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            result=result+ch;
        }

        String final_value="";

        for(int i=0;i<result.length();i++)
        {
            char ch=result.charAt(i);
            if(i%2==0)
            {
                ch=(char)(ch-32);
            }
            else
            {
                ch=(char)(ch);
            }
            final_value=final_value+ch;
        }
        System.out.println(final_value);
    }
}
public class ReverseAndToggleCase {
    public static void main(String[] args) {
        ReverseAndToggleUsingLoop.transformUsingLoop("abcdef");
        ReverseAndToggleUsingArrayList.transformUsingArrayList("defghi");
        ReverseAndToggleUsingASCII.transformUsingASCII("abcdef");
    }
}
