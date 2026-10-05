package Algorthims;

import java.util.Arrays;

// [1,2,3,4,5,6,7], K=3

// [5,6,7,1,2,3,4]

public class RotateArray {
    public static int[] RotateArrayMethods(int arr[], int value) {

        for (int i = 0; i < value; i++) {
            int last = arr[arr.length - 1];
            
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(RotateArrayMethods(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2)));
    }
}
