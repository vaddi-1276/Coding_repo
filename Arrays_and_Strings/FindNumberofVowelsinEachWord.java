package Arrays_and_Strings;

// Input:

// Java Selenium Python

// Output:

// Java = 2
// Selenium = 4
// Python = 1

public class FindNumberofVowelsinEachWord {
    public static void main(String[] args) {

        String str = "Java Selenium Python";
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
    }
}
