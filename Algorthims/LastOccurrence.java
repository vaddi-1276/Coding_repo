package Algorthims;

import java.util.Arrays;

// [1,2,2,2,3,4], Target=2

// Index : 3

public class LastOccurrence {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 3, 4 };
        Arrays.sort(arr);
        int target = 2;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}
