package Arrays_and_Strings;

// Input:

// 10, 25, 30, 45, 50, 67, 80

// Output:

// Numbers: 10 30 50 80

public class FindNumbersEndingWith_0 {
    public static void main(String[] args) {

        int arr[] = { 10, 25, 30, 45, 50, 67, 80 };
        System.out.print("Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean zerofound = false;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0) {
                    zerofound = true;
                    break;
                }
                num = num / 10;
            }

            if (zerofound == true) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
