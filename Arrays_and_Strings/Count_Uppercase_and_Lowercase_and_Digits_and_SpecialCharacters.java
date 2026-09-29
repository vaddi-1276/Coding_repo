package Arrays_and_Strings;

// Input

// Java@123Test#

// Output

// Uppercase: 2
// Lowercase: 6
// Digits: 3
// Special Characters: 2

public class Count_Uppercase_and_Lowercase_and_Digits_and_SpecialCharacters {
    public static void main(String[] args) {
        String str = "Java@123Test#";
        int countofuppercase = 0;
        int countoflowercase = 0;
        int countofdigits = 0;
        int countofspecialcharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                countofuppercase++;
            }

            else if (ch >= 'a' && ch <= 'z') {
                countoflowercase++;
            } else if (ch >= '0' && ch <= '9') {
                countofdigits++;
            } else {
                countofspecialcharacters++;
            }
        }
        System.out.println("Uppercase: " + countofuppercase);
        System.out.println("Lowercase: " + countoflowercase);
        System.out.println("Digits: " + countofdigits);
        System.out.println("Special Characters: " + countofspecialcharacters);
    }
}
