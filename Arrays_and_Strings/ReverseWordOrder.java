package Arrays_and_Strings;

// Input

// Java Selenium Testing

// Output

// Testing Selenium Java


public class ReverseWordOrder {
    public static void main(String[] args) {
        String str="Java Selenium Testing";
        String words[]=str.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
}
