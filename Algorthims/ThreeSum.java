package Algorthims;

import java.util.Arrays;

// [-1,0,1,2,-1,-4], Target=0

// [-1,-1,2] [-1,0,1]

public class ThreeSum {

    public static void main(String[] args) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int target = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 1; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < arr.length; k++) {

                    if (k > j + 1 && arr[k] == arr[k - 1]) {
                        continue;
                    }

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("[ " + arr[i] + "," + arr[j] + "," + arr[k] + " ]");
                    }
                }
            }
        }
    }
}