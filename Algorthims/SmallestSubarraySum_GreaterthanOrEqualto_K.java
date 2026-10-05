package Algorthims;

// [2,3,1,2,4,3], K=7

// 2
public class SmallestSubarraySum_GreaterthanOrEqualto_K {
    public static int SmallestSubarraySum_GreaterthanOrEqualto_KMethods(int arr[], int value) {

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum >= value) {
                    int length = j - i + 1;

                    if (length < minLength) {
                        minLength = length;
                    }
                }
            }
        }

        return minLength;
    }
    public static void main(String[] args) {
        System.out.println(SmallestSubarraySum_GreaterthanOrEqualto_KMethods(new int[]{2,3,1,2,4,3}, 7));
    }
}
