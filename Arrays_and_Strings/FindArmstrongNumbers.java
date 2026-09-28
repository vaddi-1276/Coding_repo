package Arrays_and_Strings;

// Input:

// 153, 123, 370, 456, 407

//Output:

// Armstrong Numbers: 153 370 407 

public class FindArmstrongNumbers {
    public static void main(String[] args) {

        int arr[] = { 153, 123, 370, 456, 407 };
        System.out.print("Armstrong Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + (digit * digit * digit);
                num = num / 10;
            }
            if (sum == arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
