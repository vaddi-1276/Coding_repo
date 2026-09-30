package Arrays_and_Strings;

// Input

// programming

// Output

// progamin

public class RemoveAllDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
