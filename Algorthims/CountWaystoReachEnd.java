package Algorthims;

// [2,2,1,1]

// 3

// Example
// Input:  arr = [2,2,1,1]
// Output: 3

// The possible ways are:
// 0 → 1 → 3
// 0 → 2 → 3
// 0 → 1 → 2 → 3

// So the answer is 3.

public class CountWaystoReachEnd {
    public static int CountWaystoReachEndMethods(int arr[]) {

        int count[] = new int[arr.length];

        count[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= i + arr[i] && j < arr.length; j++) {
                count[j] = count[j] + count[i];
            }
        }
        System.out.println(count[arr.length - 1]);
        return -1;
    }

    public static void main(String[] args) {
        CountWaystoReachEndMethods(new int[] { 2, 2, 1, 1 });
    }
}
