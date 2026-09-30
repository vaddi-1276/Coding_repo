package Arrays_and_Strings;

// Input

// 12, 21, 34, 43, 56

// Output

// 21 43

public class FindNumbersWhoseReverseIsGreaterThanOriginal {
    public static void main(String[] args) {

        int arr[] = { 12, 21, 34, 43, 56 };
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (rev > num) {
                System.out.print(rev + " ");
            }
        }
        System.out.println();
    }
}
