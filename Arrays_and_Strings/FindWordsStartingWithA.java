package Arrays_and_Strings;

// Input:

// Apple Java Automation Selenium API

// Output:

// Apple Automation API


public class FindWordsStartingWithA {
    public static void main(String[] args) {
        
        String str="Apple Java Automation Selenium API";
        String words[]=str.split(" ");
        System.out.print("Words Starts with A : ");
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            if(word.charAt(0)=='A')
            {
                System.out.print(words[i]+" ");
            }
        }
        System.out.println();
    }
}
