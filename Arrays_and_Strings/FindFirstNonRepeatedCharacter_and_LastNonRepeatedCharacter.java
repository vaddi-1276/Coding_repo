package Arrays_and_Strings;

//Input : programming

//Output : p
public class FindFirstNonRepeatedCharacter_and_LastNonRepeatedCharacter {
    public static void main(String[] args) {

        String str = "programming";
        System.out.print("First Non-Repeated Character : ");
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
            if (count == 1) {
                System.out.print(str.charAt(i));
                break;
            }
        }
        System.out.println();

        System.out.print("Last Non-Repeated Character : ");

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

            if (count == 1) {
                System.out.print(str.charAt(i));
                break;
            }
        }
        System.out.println();
    }
}
