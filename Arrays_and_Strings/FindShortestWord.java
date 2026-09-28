package Arrays_and_Strings;

// Input:

// Java Selenium API Testing

// Output:

// Shortest Word: API
// Length: 3

public class FindShortestWord {
    public static void main(String[] args) {

        String str = "Java Selenium API Testing";
        String words[] = str.split(" ");

        int minimumlength = Integer.MAX_VALUE;
        String shortestword = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minimumlength) {
                minimumlength = words[i].length();
                shortestword = words[i];
            }
        }
        System.out.println("Shortest Word : " + shortestword);
        System.out.println("Length : " + minimumlength);
    }
}
