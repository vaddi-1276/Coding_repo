package Arrays_and_Strings;

// Input:

// java code test apple lamp

// Output:

// Words: code lamp

public class FindWordsWithUniqueCharacters {
    public static void main(String[] args) {

        String str = "java code test apple lamp";
        String words[] = str.split(" ");

        System.out.print("Unique Words : ");
        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = j + 1; k < words[i].length(); k++) {
                    if (words[i].charAt(j) == words[i].charAt(k)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique == false) {
                    continue;
                }
            }
            if (isUnique == true) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
}
