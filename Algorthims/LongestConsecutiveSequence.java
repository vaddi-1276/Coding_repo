package Algorthims;

import java.util.Arrays;

// [100,4,200,1,3,2]

// 4

public class LongestConsecutiveSequence {
    public static int LongestConsecutiveSequenceMethods(int arr[]) {

        int longestcount = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                if (count > longestcount) {
                    longestcount = count;
                }
                count = 1;
            }

        }
        return longestcount;
    }

    public static void main(String[] args) {
        System.out.println(LongestConsecutiveSequenceMethods(new int[] { 100, 4, 200, 1, 3, 2, 6, 7, 8, 9, 10 }));
    }
}
