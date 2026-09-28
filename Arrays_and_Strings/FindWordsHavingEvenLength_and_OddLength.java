package Arrays_and_Strings;

// Input:

// Java Selenium Test Automation API

// Output:

// Even Length Word : Java Selenium Test Automation
public class FindWordsHavingEvenLength_and_OddLength {
    public static void main(String[] args) {

        String str = "Java Selenium Test Automation API eat";
        String words[] = str.split(" ");
        System.out.print("Even Length Word : ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd Length Word : ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
