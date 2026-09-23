package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [40, 10, 30, 20, 50]

// Output:
// [50, 40, 30, 20, 10]

class UsingArraysSort_SortArrayDescending {
    public static void UsingArraysSort_SortArrayDescendingMethods(int arr[]) {
        Arrays.sort(arr);
        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
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

        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        UsingRecursionSortArrayDescendingMethods(arr, index + 1);
    }
}

class UsingArrayListSortArrayDescending {
    public static void UsingArrayListSortArrayDescendingMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}

public class SortArrayDescending {
    public static void main(String[] args) {
        UsingArraysSort_SortArrayDescending
                .UsingArraysSort_SortArrayDescendingMethods(new int[] { 40, 10, 30, 20, 50 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingNestedForLoopSortArrayDescending
                .UsingNestedForLoopSortArrayDescendingMethods(new int[] { 60, 40, 10, 30, 20,
                        50 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingRecursionSortArrayDescending.UsingRecursionSortArrayDescendingMethods(
                new int[] { 60, 40, 10, 70, 80, 30, 20, 50 },
                0);
        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingArrayListSortArrayDescending
                .UsingArrayListSortArrayDescendingMethods(new int[] { 60, 40, 10, 70, 80, 30, 20, 50 });
    }
}
