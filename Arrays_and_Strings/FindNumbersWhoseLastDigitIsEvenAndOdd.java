package Arrays_and_Strings;

// Input:

// 12, 35, 46, 71, 82, 95

public class FindNumbersWhoseLastDigitIsEvenAndOdd {
    public static void main(String[] args) {

        int arr[] = { 12, 35, 46, 71, 82, 95 };
        System.out.print("Even Last Digit : ");
        for (int i = 0; i < arr.length; i++) {

            int digit = arr[i] % 10;
            if (digit % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd Last Digit : ");
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] % 10;
            if (digit % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}
