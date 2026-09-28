package Arrays_and_Strings;

// Input:

// Java 10 Selenium 20 Testing 30

// Output:

// Numbers: 10 20 30
// Sum: 60

public class FindSumofDigitsPresentinaString {
    public static void main(String[] args) {

        String str = "Java 10 Selenium 20 Testing 30";
        String words[] = str.split(" ");
        int sum = 0;
        System.out.print("Numbers : ");
        for (int i = 0; i < words.length; i++) {

            if (Character.isDigit(words[i].charAt(0))) {
                System.out.print(words[i] + " ");
                sum = sum + Integer.parseInt(words[i]);
            }
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
