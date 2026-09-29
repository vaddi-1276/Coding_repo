package Arrays_and_Strings;

import java.util.Arrays;

// Input

// Array 1: 4, 8, 12
// Array 2: 16, 20, 24

// Output

// 4 8 12 16 20 24

public class MergeTwoArrays {
    public static void main(String[] args) {

        int arr1[] = { 4, 8, 12 };
        int arr2[] = { 16, 20, 24 };

        int newarr[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newarr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newarr[index++] = arr2[i];
        }

        System.out.println(Arrays.toString(newarr));
    }
}
