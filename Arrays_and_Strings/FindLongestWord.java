package Arrays_and_Strings;

// Input:

// Java Selenium Automation Testing

// Output:

// Longest Word: Automation
// Length: 10

public class FindLongestWord {
    public static void main(String[] args) {

        String str = "Java Selenium Automation Testing";
        String words[] = str.split(" ");

        int longestlength = Integer.MIN_VALUE;
        String longestword = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestlength) {
                longestlength = words[i].length();
                longestword = words[i];

            }
        }
        System.out.println("Longest Word : " + longestword);
        System.out.println("Length : " + longestlength);
    }
}
