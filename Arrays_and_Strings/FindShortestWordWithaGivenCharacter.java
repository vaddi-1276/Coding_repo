package Arrays_and_Strings;

// Input

// String: java selenium api automation code
// Character: a

// Output

// Word: api

public class FindShortestWordWithaGivenCharacter {
    public static void main(String[] args) {

        String str = "java selenium api automation code";
        String words[] = str.split(" ");

        int shortestlength = Integer.MAX_VALUE;
        String word = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {

                if (words[i].charAt(0) == 'a') {
                    if (words[i].length() < shortestlength) {
                        shortestlength = words[i].length();
                        word = words[i];
                    }
                }
            }
        }
        System.out.println("Word: " + word);
    }
}
