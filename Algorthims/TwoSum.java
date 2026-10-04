package Algorthims;

import java.util.Arrays;

// [2,7,11,15], Target=9

// 2,7

public class TwoSum {
    public static int[] TwoSumMethods(int arr[], int value) {

        int firstvalue = arr[0];
        int secondvalue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    firstvalue=arr[i];
                    secondvalue=arr[j];
                    System.out.println("( "+firstvalue+" , "+secondvalue+" )");
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSumMethods(new int[] { 2, 7, 11, 15,6,3 }, 9)));
    }
}
