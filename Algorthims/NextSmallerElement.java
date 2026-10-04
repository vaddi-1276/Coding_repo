package Algorthims;

import java.util.Arrays;

// [4,8,5,2,25]	

// [2,5,2,-1,-1]

public class NextSmallerElement {
    public static int[] NextSmallerElementMethods(int arr[]) {

        int newarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    newarr[i] = arr[j];
                    break;
                }
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(NextSmallerElementMethods(new int[] { 4, 8, 5, 2, 25 })));
    }
}
