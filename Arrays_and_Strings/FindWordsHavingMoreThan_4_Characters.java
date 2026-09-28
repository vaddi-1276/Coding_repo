package Arrays_and_Strings;

// Input:

// Java Selenium API Test Automation

// Output:

// Selenium Automation

public class FindWordsHavingMoreThan_4_Characters {
    public static void main(String[] args) {

        String str = "Java Selenium API Test Automation";
        String words[] = str.split(" ");
        System.out.print("Words Length More than 4 charcaters : ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
