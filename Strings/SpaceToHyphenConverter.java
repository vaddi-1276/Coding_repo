package Strings;

// Input:
// Java Selenium Testing

// Output:
// Java-Selenium-Testing


class SpaceToHyphenUsingReplace{
    public static void convertUsingReplace(String str) {
        
        String result=str.replace(" ", "-");
        System.out.print(result);
        System.out.println();
    }
}

class SpaceToHyphenUsingLoop
{
    public static void convertUsingLoop(String str) {
        
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                result=result+"-";
            }
            else
            {
                result=result+ch;
            }
        }
        System.out.print(result);
        System.out.println();
    }
}
public class SpaceToHyphenConverter {
    public static void main(String[] args) {
        SpaceToHyphenUsingReplace.convertUsingReplace("Java Selenium Testing");
        SpaceToHyphenUsingLoop.convertUsingLoop("Python Selenium Testing");
    }
}
