package Algorthims;

import java.util.Arrays;

// [10,4,2,20,40,12,30]

// [-1,10,4,-1,-1,40,40]

public class PreviousGreaterElement {
    public static int[] PreviousGreaterElementmethods(int arr[]) {

        int newarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    newarr[i] = arr[j];
                    break;
                }
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PreviousGreaterElementmethods(new int[] { 10, 4, 2, 20, 40, 12, 30 })));
    }
}
