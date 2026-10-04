package Arrays_and_Strings;

// Input

// 135, 246, 357, 482, 579

// Output

// 135 357 579

public class FindNumbersHavingExactlyTwoOddDigits {
    public static void main(String[] args) {

        int arr[] = { 135, 246, 357, 482, 579 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
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
