package Algorthims;

import java.util.Arrays;

// [1,2,4,5,6,9]

// 3,7,8

public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6, 9 };
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println(i);
            }
        }
    }
}
