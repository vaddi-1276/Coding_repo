package Arrays_and_Strings;

// Input:

// Java Selenium Python Testing

// Output:

// J S P T

public class FindFirstCharacterofEveryWord {
    public static void main(String[] args) {

        String str = "Java Selenium Python Testing";
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            System.out.print(word.substring(0, 1) + " ");
        }
        System.out.println();
    }
}
