package Arrays_and_Strings;


// Input:

// Java Selenium Python Testing

// Output:

// a m n g


public class FindLastCharacterofEveryWord {
    public static void main(String[] args) {
        
        String str="Java Selenium Python Testing";
        String words[]=str.split(" ");

        for(int i=0;i<words.length;i++)
        {
            String word=words[i];

            System.out.print(word.substring(word.length()-1)+" ");
        }
        System.out.println();
    }
}
