package Arrays;

import java.util.Arrays;

// Input:
// [5, 2, 8, 1, 3]

// Output:
// [1, 2, 3, 5, 8]

class UsingNestedForLoopSortWithoutUsingArrays_sort {
    public static void UsingNestedForLoopSortWithoutUsingArrays_sortMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class UsingRecursionSortWithoutUsingArrays_sort {
    public static void UsingRecursionSortWithoutUsingArrays_sortMethods(int arr[], int index) {

        if (index == arr.length - 1) {
            return;
        }

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] > arr[j]) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        UsingRecursionSortWithoutUsingArrays_sortMethods(arr, index + 1);
    }
}

public class SortWithoutUsingArrays_sort {
    public static void main(String[] args) {
        UsingNestedForLoopSortWithoutUsingArrays_sort
                .UsingNestedForLoopSortWithoutUsingArrays_sortMethods(new int[] { 5, 2, 8, 1, 3 });

        int arr[] = new int[] { 9, 5, 2, 4, 8, 1, 3 };
        UsingRecursionSortWithoutUsingArrays_sort
                .UsingRecursionSortWithoutUsingArrays_sortMethods(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
