package Strings;

// Input:
// abcdef

// Output:
// abdcef

class using_for_loop_class
{
    public static void using_for_loop_methods(String str) {
        
        int n=str.length()/2;
        System.out.println(n);
        String result="";
        String middle_characters="";
        String reverse_middle_characters="";

        for(int i=0;i<n-1;i++)
        {
            result=result+str.charAt(i);
        }
        for(int i=n-1;i<=n;i++)
        {
            middle_characters=middle_characters+str.charAt(i);
        }
        for(int i=middle_characters.length()-1;i>=0;i--)
        {
            reverse_middle_characters=reverse_middle_characters+middle_characters.charAt(i);
        }
        result=result+reverse_middle_characters;
        for(int i=n+1;i<str.length();i++)
        {
            result=result+str.charAt(i);
        }
        System.out.println(result);
    }
}


public class Reverse_Middle_Characters {
    public static void main(String[] args) {
        using_for_loop_class.using_for_loop_methods("abcdef");
    }
}
