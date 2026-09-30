package Arrays_and_Strings;

// Input

// programming

// Output

// First Repeated Character: r

public class FindFirstRepeatedCharacter_and_LastRepeatedCharacter {
    public static void main(String[] args) {

        String str = "programming";
        System.out.print("First Repeated Charcater : ");
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
            int count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(str.charAt(i));
                break;
            }
        }
        System.out.println();

        // Input

        // programming

        // Output

        // Last Repeated Character: m

        System.out.print("Last Repeated Charcater : ");

        for (int i = str.length() - 1; i >= 0; i--) {
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
            int count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(str.charAt(i));
                break;
            }
        }
        System.out.println();
    }
}
