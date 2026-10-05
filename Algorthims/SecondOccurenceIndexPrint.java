package Algorthims;

import java.util.Arrays;

// Input:
// Array = [1, 2, 2, 2, 3, 4]
// Target = 2

// Output:
// Index : 2

public class SecondOccurenceIndexPrint {

    public static int SecondOccurenceIndexPrintMethods(int arr[], int target) {

        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;

                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SecondOccurenceIndexPrintMethods(new int[] { 1, 2, 2, 2, 3, 4 }, 2));
    }
}
