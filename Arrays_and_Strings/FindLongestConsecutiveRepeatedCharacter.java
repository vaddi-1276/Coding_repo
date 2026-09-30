package Arrays_and_Strings;

// Input

// aaabbccccddeee

// Output

// Character: c
// Count: 4

public class FindLongestConsecutiveRepeatedCharacter {

    public static void main(String[] args) {

        String str = "aaabbccccddeee";
        int count = 1;
        int longestcount = 1;

        char longestchar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > longestcount) {
                longestcount = count;
                longestchar = str.charAt(i);
            }
        }
        System.out.println("Character : " + longestchar);
        System.out.println("Count : " + longestcount);
    }
}
