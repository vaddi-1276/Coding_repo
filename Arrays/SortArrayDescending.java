package Arrays;

import java.util.Arrays;

// Input:
// [40, 10, 30, 20, 50]

// Output:
// [50, 40, 30, 20, 10]

class UsingArraysSort_SortArrayDescending {
    public static void UsingArraysSort_SortArrayDescendingMethods(int arr[]) {
        Arrays.sort(arr);
        int descendingarr[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            descendingarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(descendingarr));
    }
}

class UsingNestedForLoopSortArrayDescending {
    public static void UsingNestedForLoopSortArrayDescendingMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class UsingRecursionSortArrayDescending {
    public static void UsingRecursionSortArrayDescendingMethods(int arr[], int index) {

        if (index == arr.length - 1) {
            return;
        }

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] < arr[j]) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        UsingRecursionSortArrayDescendingMethods(arr, index + 1);
    }
}

public class SortArrayDescending {
    public static void main(String[] args) {
        UsingArraysSort_SortArrayDescending
                .UsingArraysSort_SortArrayDescendingMethods(new int[] { 40, 10, 30, 20, 50 });

        UsingNestedForLoopSortArrayDescending
                .UsingNestedForLoopSortArrayDescendingMethods(new int[] { 60, 40, 10, 30, 20, 50 });

        int arr[] = new int[] { 60, 40, 10, 70, 80, 30, 20, 50 };
        UsingRecursionSortArrayDescending.UsingRecursionSortArrayDescendingMethods(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
