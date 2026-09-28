package Arrays_and_Strings;

// Input:

// Java 10 Selenium 15 API 20 Testing 25

// Even Numbers :  10,20

// odd Numbers : 15 25

public class FindEvenNumbers_and_OddNumbers_PresentinaString {

    public static void main(String[] args) {

        String str = "Java 10 Selenium 15 API 20 Testing 25";
        String words[] = str.split(" ");

        System.out.print("Even Numbers :  ");
        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {

                if (Integer.parseInt(words[i]) % 2 == 0) {
                    System.out.print(words[i] + " ");
                }
            }
        }
        System.out.println();

        System.out.print("Odd Numbers :  ");

        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                if (Integer.parseInt(words[i]) % 2 != 0) {
                    System.out.print(words[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
