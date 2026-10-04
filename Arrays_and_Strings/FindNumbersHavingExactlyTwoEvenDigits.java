package Arrays_and_Strings;

// Input

// 246, 135, 428, 572, 864

// Output

// 246 428 864

public class FindNumbersHavingExactlyTwoEvenDigits {
    public static void main(String[] args) {
        int arr[] = { 246, 135, 428, 572, 864 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    count++;
                }
                num = num / 10;
            }

            if (count >= 2) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
