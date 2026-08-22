package Strings;

// Input:
// Java Selenium Python

// Output:
// Reverse = muineleS avaJ
// Without Spaces = muineleSavaJ

class UsingForLoopReverseAndRemoveSpaces {
    public static void UsingForLoopReverseAndRemoveSpacesMethods(String str) {

        String reverseString="";
        String withoutspaces="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);

            if(ch==' ')
            {
                reverseString=reverseString+ch;
            }
            else{
                reverseString=reverseString+ch;
                withoutspaces=withoutspaces+ch;
            }
        }
        System.out.println("Reverse = "+reverseString);
        System.out.println("Without Spaces = "+withoutspaces);
    }
}

public class ReverseAndRemoveSpaces {
    public static void main(String[] args) {
        UsingForLoopReverseAndRemoveSpaces.UsingForLoopReverseAndRemoveSpacesMethods("Java Selenium Python");
    }
}
