package Arrays_and_Strings;

// Input

// automation

// Output

// * *t*m*t**n

public class ReplaceEveryVowelWith_star {
    public static void main(String[] args) {

        String str = "automation";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiouAEIOU".indexOf(ch)!= -1) {
                result = result + "*";
            } else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
