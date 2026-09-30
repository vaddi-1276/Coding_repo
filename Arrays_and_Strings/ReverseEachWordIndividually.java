package Arrays_and_Strings;

// Input

// Java Selenium Testing

// Output

// avaJ muineleS gnitseT


public class ReverseEachWordIndividually {
    public static void main(String[] args) {
        
        String str="Java Selenium Testing";
        String words[]=str.split(" ");
        String result="";
        for(int i=0;i<words.length;i++)
        {
            for(int j=words[i].length()-1;j>=0;j--)
            {
                result=result+words[i].charAt(j);
            }
            result=result+" ";
        }
        System.out.println(result);
    }
}
