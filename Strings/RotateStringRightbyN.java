package Strings;

import java.util.ArrayList;

// Input:
// abcdef
// N = 2

// Output:
// efabcd

class UsingSubStringRightbyN {
    public static void UsingSubStringRightbyNMethods(String str) {

        int position = 2;
        String result = "";

        result = str.substring(str.length() - position);
        result = result + str.substring(0, str.length() - position);

        System.out.println(result);

    }
}

class UsingNestedForLoopRotateStringRightbyN {
    public static void UsingNestedForLoopRotateStringRightbyNMethods(String str) {

        int position = 2;
        String result = "";

        for (int i = str.length() - position; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < str.length() - position; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}

class UsingArrayListRotateStringRightbyN
{
    public static void UsingArrayListRotateStringRightbyNMethods(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        int position=2;
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        ArrayList<Character>result=new ArrayList<>();

        for(int j=list.size()-position;j<list.size();j++)
        {
            result.add(list.get(j));
        }

        for(int i=0;i<list.size()-position;i++)
        {
            result.add(list.get(i));
        }
        StringBuilder finalvalue=new StringBuilder();
        for(int i=0;i<result.size();i++)
        {
            finalvalue.append(result.get(i));
        }
        System.out.println(finalvalue);
    }
}

public class RotateStringRightbyN {
    public static void main(String[] args) {
        UsingSubStringRightbyN.UsingSubStringRightbyNMethods("abcdef");
        UsingNestedForLoopRotateStringRightbyN.UsingNestedForLoopRotateStringRightbyNMethods("abcdef");
        UsingArrayListRotateStringRightbyN.UsingArrayListRotateStringRightbyNMethods("abcdef");
    }
}
