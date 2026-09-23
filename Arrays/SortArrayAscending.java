package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [40, 10, 30, 20, 50]

// Output:
// [10, 20, 30, 40, 50]

class UsingArraysSort_SortArrayAscending {
    public static void UsingArraysSort_SortArrayAscendingMethods(int arr[]) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class UsingNestedForLoopSortArrayAscending {
    public static void UsingNestedForLoopSortArrayAscendingMethods(int arr[]) {
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

class UsingRecursionSortArrayAscending {
    public static void UsingRecursionSortArrayAscendingMethods(int arr[], int index) {

        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        UsingRecursionSortArrayAscendingMethods(arr, index + 1);
    }
}

class UsingArrayListSortArrayAscending {
    public static void UsingArrayListSortArrayAscendingMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}

public class SortArrayAscending {
    public static void main(String[] args) {
        UsingArraysSort_SortArrayAscending.UsingArraysSort_SortArrayAscendingMethods(new int[] { 40, 10, 30, 20, 50 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingNestedForLoopSortArrayAscending
                .UsingNestedForLoopSortArrayAscendingMethods(new int[] { 40, 10, 30, 20, 50, 60 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingRecursionSortArrayAscending.UsingRecursionSortArrayAscendingMethods(new int[] { 40, 10, 30, 20, 50 }, 0);

        System.out.println(
                "----------------------------------------------------------------------------------------------");
        UsingArrayListSortArrayAscending.UsingArrayListSortArrayAscendingMethods(new int[] { 60, 40, 10, 30, 20, 50 });
    }
}
