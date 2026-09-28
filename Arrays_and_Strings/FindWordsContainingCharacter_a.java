package Arrays_and_Strings;

// Input:

// Java Selenium ate eat

// Output:

// Java 

public class FindWordsContainingCharacter_a {
    public static void main(String[] args) {

        String str = "Java Selenium ate eat";
        String words[] = str.split(" ");
        System.out.print("Words contains a : ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (ch == 'a') {
                    System.out.print(words[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
