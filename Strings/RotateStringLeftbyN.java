package Strings;

import java.util.ArrayList;

// Input:
// abcdef
// N = 2

// Output:
// cdefab

class UsingNestedForLoopRotateStringLeftbyN {
    public static void UsingNestedForLoopRotateStringLeftbyNMethods(String str) {
        String result = "";
        int n = 2;
        for (int i = n; i < str.length(); i++) {
            result = result + str.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}

class UsingSubstringRotateStringLeftbyN {
    public static void UsingSubstringRotateStringLeftbyNMethods(String str) {

        String result = "";
        int n = 2;
        result = result + str.substring(n) + str.substring(0, n);

        System.out.println(result);
    }
}

class UsingArrayListRotateStringLeftbyN
{
    public static void UsingArrayListRotateStringLeftbyNMethods(String str) {
        
        ArrayList<Character>list=new ArrayList<>();
        int n=2;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }

        for(int i=n;i<list.size();i++)
        {
            result.append(list.get(i));
        }

        for(int i=0;i<n;i++)
        {
            result.append(list.get(i));
        }

        System.out.println(result);
    }
}
public class RotateStringLeftbyN {
    public static void main(String[] args) {
        UsingNestedForLoopRotateStringLeftbyN.UsingNestedForLoopRotateStringLeftbyNMethods("abcdef");
        UsingSubstringRotateStringLeftbyN.UsingSubstringRotateStringLeftbyNMethods("abcdef");
        UsingArrayListRotateStringLeftbyN.UsingArrayListRotateStringLeftbyNMethods("abcdef");
    }
}
