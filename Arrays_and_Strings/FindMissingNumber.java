package Arrays_and_Strings;

import java.util.Arrays;

// Input

// 1, 2, 3, 4, 6, 7,10

// Output

// Missing Number: 5 8 9

public class FindMissingNumber {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7, 11 };
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
