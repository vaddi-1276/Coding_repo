package Arrays_and_Strings;

// Input:

// 15, 20, 35, 42, 51, 67, 80

// Output:

// Numbers: 15 35 51

public class FindNumbersContainingDigit_5 {
    public static void main(String[] args) {

        int arr[] = { 15, 20, 35, 42, 51, 67, 80 };
        System.out.print("Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean found = false;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 5) {
                    found = true;
                    break;
                }
                num = num / 10;
            }
            if (found == true) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
