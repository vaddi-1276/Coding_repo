package Strings;

// Input:
// abcdefgh, N=3

// Output:
// cbafedh

class ReverseGroupsUsingLoop {
    public static void reverseUsingLoop(String str) {

        String result="";
        int n=3;
        for(int i=0;i<str.length();i+=n)
        {
            for(int j=Math.min(i+n-1,str.length()-1);j>=i;j--)
            {
                result=result+str.charAt(j);
            }
        }
        System.out.println(result);
    }
}

class ReverseGroupsUsingSubstring
{
    public static void reverseUsingSubstring(String str) {
        int n=3;
        String result="";
        for(int i=0;i<str.length();i+=n)
        {
            int end=Math.min(i+n,str.length());
            String firstPart=str.substring(i, end);
            result=result+new StringBuilder(firstPart).reverse();
        }
        System.out.println(result);
    }
}

public class ReverseInGroupsOfN {
    public static void main(String[] args) {
        ReverseGroupsUsingLoop.reverseUsingLoop("abcdefgh");
        ReverseGroupsUsingSubstring.reverseUsingSubstring("abcdefgh");
    }
}
