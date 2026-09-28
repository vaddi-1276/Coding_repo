package Arrays_and_Strings;

// Input:

// java code test apple lamp

// Output:

// Words: java apple test

public class FindWordsHavingDuplicateCharacters {
    public static void main(String[] args) {

        String str = "java code test apple lamp";
        String words[] = str.split(" ");

        System.out.print("Words : ");
        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = j + 1; k < words[i].length(); k++) {
                    if (words[i].charAt(j) == words[i].charAt(k)) {
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                    continue;
                }
            }
            if (found == true) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
