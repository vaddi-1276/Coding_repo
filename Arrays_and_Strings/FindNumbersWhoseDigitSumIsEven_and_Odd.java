package Arrays_and_Strings;

// Input:

// 12, 15, 23, 40, 51, 72

public class FindNumbersWhoseDigitSumIsEven_and_Odd {
    public static void main(String[] args) {

        int arr[] = { 12, 15, 23, 40, 51, 72 };

        System.out.print("Even digit Sum : ");
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            if (sum % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd digit Sum : ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
