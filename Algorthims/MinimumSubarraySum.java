package Algorthims;

// [3,-4,2,-3,-1,7]

// -6

public class MinimumSubarraySum {

    public static int MinimumSubarraySumMethods(int arr[]) {

        int minsum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum < minsum) {
                    minsum = sum;
                }
            }
        }
        return minsum;
    }

    public static void main(String[] args) {
        System.out.println(MinimumSubarraySumMethods(new int[] { 3, -4, 2, -3, -1, 7 }));
    }
}
