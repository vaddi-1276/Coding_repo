package Arrays_and_Strings;

// Input:

// Java Selenium Python Data Java

// Output:

// Java Data Java

public class FindWordsEndingWith_a {
    public static void main(String[] args) {

        String str = "Java Selenium Python Data Java";
        String words[] = str.split(" ");
        System.out.print("Words ends with a : ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].endsWith("a")) {
                System.out.print(words[i]+" ");
            }
        }
        System.out.println();
    }
}
