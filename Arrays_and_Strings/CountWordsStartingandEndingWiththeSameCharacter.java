package Arrays_and_Strings;

// Input:

// java area apple test data

// Output:

// Words: area test

public class CountWordsStartingandEndingWiththeSameCharacter {
    public static void main(String[] args) {

        String str = "java area apple test data level radar madam";
        String words[] = str.split(" ");
        System.out.print("Words : ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char firstchar = words[i].charAt(0);
                char lastchar = words[i].charAt(words[i].length() - 1);

                if (firstchar == lastchar) {
                    System.out.print(words[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
