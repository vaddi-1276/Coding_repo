package Arrays_and_Strings;

// Input

// 123, 145, 222, 316, 421

// Output

// 123 222

public class FindNumbersWhoseDigitSumIsDivisibleby_3 {
    public static void main(String[] args) {

        int arr[] = { 123, 145, 222, 316, 421 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
