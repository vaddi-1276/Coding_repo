package Arrays_and_Strings;

// Input

// String 1: abcde
// String 2: cdeab

// Output

// Rotation: true


public class CheckWhetherOneStringIsRotationofAnother {
    public static void main(String[] args) {
        
        String str1="abcde";
        String str2="cdeadb";

        String temp=str1+str1;

        if(temp.contains(str2))
        {
            System.out.println("Rotation : true");
        }
        else
        {
            System.out.println("Rotation : false");
        }
    }
}
