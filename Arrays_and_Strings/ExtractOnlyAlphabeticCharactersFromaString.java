package Arrays_and_Strings;

// Input

// Java123@Selenium456#API

// Output

// JavaSeleniumAPI


public class ExtractOnlyAlphabeticCharactersFromaString {
    public static void main(String[] args) {
        
        String str="Java123@Selenium456#API";
        String finalString="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(Character.isLetter(ch))
            {
                finalString=finalString+ch;
            }
        }
        System.out.println(finalString);
    }
}
