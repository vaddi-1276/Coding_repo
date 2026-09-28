package Arrays_and_Strings;

// Input:

// java madam level selenium racecar

// Output:

// Palindrome Words: madam level racecar

public class FindPalindromeWords {
    public static void main(String[] args) {

        String str = "java madam level selenium racecar";
        String words[] = str.split(" ");

        System.out.print("Palindrome Words: ");
        for (int i = 0; i < words.length; i++) {
            String reverseString = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseString = reverseString + words[i].charAt(j);
            }
            if (reverseString.equals(words[i])) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
