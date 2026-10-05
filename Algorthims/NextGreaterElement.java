package Algorthims;

import java.util.Arrays;

// [4,5,2,25]

// [5,25,25,-1]

public class NextGreaterElement {
    public static int[] NextGreaterElementMethods(int arr[]) {

        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    newarr[i] = arr[j];
                    break;
                }
            }

        }

        return newarr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(NextGreaterElementMethods(new int[] { 4, 5, 2, 25 })));
    }
}
