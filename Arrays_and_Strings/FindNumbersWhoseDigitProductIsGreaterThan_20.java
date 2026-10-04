package Arrays_and_Strings;

// Input

// 123, 234, 315, 426, 512

// Output

// 234 426

public class FindNumbersWhoseDigitProductIsGreaterThan_20 {
    public static void main(String[] args) {

        int arr[] = { 123, 234, 315, 426, 512 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int product = 1;
            while (num > 0) {
                int digit = num % 10;
                product = product * digit;
                num = num / 10;
            }
            if (product > 20) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
