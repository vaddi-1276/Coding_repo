package Strings;

// Input:
// abcdef

// Output:
// cbadef

class nested_for_loop_class
{
    public static void nested_for_loop_methods(String str)
    {
        int n=str.length()/2;
        String firsthalf="";

        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            firsthalf=firsthalf+ch;
        }

        String rev_firsthalf="";
        for(int j=firsthalf.length()-1;j>=0;j--)
        {
            char ch=str.charAt(j);
            rev_firsthalf=rev_firsthalf+ch;
        }
        System.out.println(rev_firsthalf);

        String final_value="";

        for(int i=0;i<n;i++)
        {
            final_value=final_value+rev_firsthalf.charAt(i);
        }
        for(int j=n;j<str.length();j++)
        {
            final_value=final_value+str.charAt(j);
        }

        System.out.println(final_value);
    }
}
public class Reverse_First_Half {
    public static void main(String[] args) {
        nested_for_loop_class.nested_for_loop_methods("abcdef");
    }
}
