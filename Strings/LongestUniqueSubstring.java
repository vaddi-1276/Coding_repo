package Strings;

// Input:
// abcabcbb

// Output:
// abc
// Length = 3

class UsingForLoopLongestUniqueSubstring {
    public static void UsingForLoopLongestUniqueSubstringMethods(String str) {
        int longestlength=Integer.MIN_VALUE;
        String longestuniqueString="";
        
        for(int i=0;i<str.length();i++)
        {
            String uniqueString="";
            boolean found=false;
            for(int j=i;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    found=true;
                    break;
                }
            }
        }
    }
}

public class LongestUniqueSubstring {
    public static void main(String[] args) {

    }
}
