package Algorthims;

import java.util.Arrays;

// [1,2,-3,-4,5,-6]

// [1,-3,2,-4,5,-6]

public class Positive_and_NegativeRearrangement {
    public static int[] Positive_and_NegativeRearrangementMethods(int arr[]) {

        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && index < arr.length) {
                newarr[index] = arr[i];
                index = index + 2;
            }
        }
        index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && index < arr.length) {
                newarr[index] = arr[i];
                index = index + 2;
            }
        }

        return newarr;
    }

    public static void main(String[] args) {
        System.out
                .println(Arrays.toString(Positive_and_NegativeRearrangementMethods(new int[] { 1, 2, -3, -4, 5, -6 })));
    }
}
