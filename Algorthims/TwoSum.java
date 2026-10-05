package Algorthims;

import java.util.Arrays;

// [2,7,11,15], Target=9

// 2,7

public class TwoSum {
    public static int[] TwoSumMethods(int arr[], int value) {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==value)
                {
                    System.out.println("[ "+arr[i]+" , "+arr[j]+" ]");
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSumMethods(new int[] { 2, 7, 11, 15,6,3 }, 9)));
    }
}
