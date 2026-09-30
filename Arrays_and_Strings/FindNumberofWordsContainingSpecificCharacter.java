package Arrays_and_Strings;

// Input

// String: java selenium automation testing
// Character: t

// Output

// Count: 2

public class FindNumberofWordsContainingSpecificCharacter {
    public static void main(String[] args) {

        String str = "java selenium automation testing";
        String words[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                if (ch == 't') {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Count:  " + count);
    }
}
