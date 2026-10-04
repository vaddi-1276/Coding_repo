package Algorthims;

// [-2,1,-3,4,-1,2,1,-5,4]

// 6

public class MaximumSubarraySum {
    public static int MaximumSubarraySumMethods(int arr[]) {

        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum > maxsum) {
                    maxsum = sum;
                }

                System.out.println(arr[j] + " arr[j] " + arr[j]);
                System.out.println(j + " j " + maxsum);
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        System.out.println(MaximumSubarraySumMethods(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}
