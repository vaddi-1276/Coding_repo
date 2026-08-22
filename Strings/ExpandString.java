package Strings;

import java.util.ArrayList;

// Input:
// a3b2c12d4

// Output:
// aaabbccccccccccccdddd

class UsingForLoopExpandString {
    public static void UsingForLoopExpandStringMethods(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                count = count * 10 + Character.getNumericValue(str.charAt(i + 1));
                i++;
            }

            for (int j = 0; j < count; j++) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

class UsingArrayListExpandString
{
    public static void UsingArrayListExpandStringMethods(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            char ch=list.get(i);
            int count=0;

            while(i+1<list.size() && Character.isDigit(list.get(i+1)))
            {
                count=count*10+Character.getNumericValue(list.get(i+1));
                i++;
            }

            for(int j=0;j<count;j++)
            {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

public class ExpandString {
    public static void main(String[] args) {
        UsingForLoopExpandString.UsingForLoopExpandStringMethods("a3b2c12d4");
        UsingArrayListExpandString.UsingArrayListExpandStringMethods("a3b3c12");
    }
}
