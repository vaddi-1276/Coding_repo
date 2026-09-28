package Arrays_and_Strings;

// Input:

// Java Selenium Automation Testing

// Output:

// Word: Automation
// Vowels: 6

public class FindWordWithMaximumVowels {
    public static void main(String[] args) {

        int vowelsmaxmimumcount = Integer.MIN_VALUE;
        int vowelsmimimumcount = Integer.MAX_VALUE;
        String maximumword = "";
        String minimumword = "";
        String str = "Java Selenium Automation Testing";
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            if (count > vowelsmaxmimumcount) {
                vowelsmaxmimumcount = count;
                maximumword = words[i];
            }

            if (count < vowelsmimimumcount) {
                vowelsmimimumcount = count;
                minimumword = words[i];
            }
        }
        System.out.println("Maximum vowels Word : " + maximumword);
        System.out.println("Maximum Count : " + vowelsmaxmimumcount);

        System.out.println("Minimum vowels Word : " + minimumword);
        System.out.println("Minimum Count : " + vowelsmimimumcount);
    }
}
