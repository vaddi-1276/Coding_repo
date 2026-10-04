package Algorthims;

// [10,5,2,7,1,9], K=15

// 4

// Input: nums = [10,5,2,7,1,9], K = 15

// Output: 4

// Explanation:
// The subarray [5,2,7,1] has a sum of:

// 5 + 2 + 7 + 1 = 15

// Its length is 4.

// Therefore, the length of the longest subarray
// whose sum is equal to K is 4.

public class LongestSubarraySum_K {
    public static int LongestSubarraySum_KMethods(int arr[], int value) {

        int longestsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == value) {

                    int length = j - i + 1;

                    if (length > longestsum) {
                        longestsum = length;
                    }
                }
            }

        }

        return longestsum;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubarraySum_KMethods(new int[] { 10, 5, 2, 7, 1, 9 }, 15));
    }
}
