package Arrays_and_Strings;

// Input

// 12, 23, 34, 41, 50

// Numbers: 12 23 34 41 50
// Sum: 160

public class FindSumNumbersWhoseDigitSumIsPrime {
    public static void main(String[] args) {

        int arr[] = { 12, 23, 34, 41, 50 };
        System.out.print("Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            int count = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            for (int j = 1; j <= sum; j++) {
                if (sum % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
