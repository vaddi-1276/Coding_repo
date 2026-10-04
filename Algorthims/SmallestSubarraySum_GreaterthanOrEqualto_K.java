package Algorthims;

// [2,3,1,2,4,3], K=7

// 2
public class SmallestSubarraySum_GreaterthanOrEqualto_K {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 1, 2, 4, 3 };
        int value = 7;
        int minlength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum >= value) {
                    int length = j - i + 1;

                    if (length < minlength) {
                        minlength = length;
                    }
                }
            }
        }
        System.out.println(minlength);
    }
}
