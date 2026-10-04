package Algorthims;

// [7,1,5,3,6,4]

// 6

public class MaximumDifference {
    public static int MaximumDifferenceMethods(int arr[]) {

        int maxdiff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = Math.abs(arr[j] - arr[i]);

                if (product > maxdiff) {
                    maxdiff = product;
                }
            }
        }
        return maxdiff;
    }

    public static void main(String[] args) {
        System.out.println(MaximumDifferenceMethods(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
