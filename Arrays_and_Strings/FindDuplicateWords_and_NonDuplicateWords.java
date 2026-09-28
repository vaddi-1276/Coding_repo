package Arrays_and_Strings;

// Input:

// java selenium java testing selenium python

// Output:

// Duplicate Words: java selenium

public class FindDuplicateWords_and_NonDuplicateWords {
    public static void main(String[] args) {

        String str = "java selenium java testing selenium python";
        String words[] = str.split(" ");

        System.out.print("Duplicate Words: ");
        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < words.length; k++) {
                if (words[k].equals(words[i])) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Non Duplicate Words : ");

        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {

                if (words[i].equals(words[j])) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            int count = 1;
            for (int k = i + 1; k < words.length; k++) {
                if (words[k].equals(words[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
