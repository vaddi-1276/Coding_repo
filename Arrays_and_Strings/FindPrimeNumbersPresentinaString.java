package Arrays_and_Strings;

// Input:

// Java 10 Selenium 11 API 13 Testing 20 17

// Output:

// Prime Numbers: 11 13 17
// Sum: 41

public class FindPrimeNumbersPresentinaString {
    public static void main(String[] args) {

        String str = "Java 10 Selenium 11 API 13 Testing 20 17";
        String words[] = str.split(" ");
        int sum = 0;
        System.out.print("Prime Numbers: ");
        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                int number = Integer.parseInt(words[i]);
                int count = 0;
                for (int j = 1; j <= number; j++) {
                    if (number % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(number + " ");
                    sum = sum + number;
                }
            }
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
