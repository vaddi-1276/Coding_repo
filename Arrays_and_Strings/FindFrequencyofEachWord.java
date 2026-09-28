package Arrays_and_Strings;

// Input:

// java selenium java testing selenium java

// Output:

// java = 3
// selenium = 2
// testing = 1

public class FindFrequencyofEachWord {
    public static void main(String[] args) {
        String str = "java selenium java testing selenium java";
        String words[] = str.split(" ");

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
            System.out.println(words[i] + " = " + count);
        }
    }
}
