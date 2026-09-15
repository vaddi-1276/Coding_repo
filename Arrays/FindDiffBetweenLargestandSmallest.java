package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input: [10, 25, 5, 40, 15]
// Output: 35

class UsingArraysSortFindDiffBetweenLargestandSmallest {
    public static void UsingArraysSortFindDiffBetweenLargestandSmallestMethods(int arr[]) {
        Arrays.sort(arr);
        int minvalue = arr[0];
        int maxvalue = arr[arr.length - 1];
        int diff = maxvalue - minvalue;
        System.out.println(diff);
    }
}

class UsingNestedForLoopFindDiffBetweenLargestandSmallest {
    public static void UsingNestedForLoopFindDiffBetweenLargestandSmallestMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int minvalue = arr[0];
        int maxvalue = arr[arr.length - 1];
        int diff = maxvalue - minvalue;

        System.out.println(diff);
    }
}

class UsingRecursionFindDiffBetweenLargestandSmallest {
    public static void UsingRecursionFindDiffBetweenLargestandSmallestMethods(int arr[], int index, int minvalue,
            int maxvalue) {

        if (index == arr.length) {
            System.out.println(maxvalue - minvalue);
            return;
        }

        minvalue = Math.min(minvalue, arr[index]);
        maxvalue = Math.max(maxvalue, arr[index]);
        UsingRecursionFindDiffBetweenLargestandSmallestMethods(arr, index + 1, minvalue, maxvalue);
    }
}

class UsingCollectionsSortFindDiffBetweenLargestandSmallest {
    public static void UsingCollectionsSortFindDiffBetweenLargestandSmallestMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        int diff = max - min;
        System.out.println(diff);
    }
}

public class FindDiffBetweenLargestandSmallest {
    public static void main(String[] args) {
        UsingArraysSortFindDiffBetweenLargestandSmallest
                .UsingArraysSortFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingNestedForLoopFindDiffBetweenLargestandSmallest
                .UsingNestedForLoopFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25, 5, 40, 15, 45 });
        UsingRecursionFindDiffBetweenLargestandSmallest
                .UsingRecursionFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25, 5, 40, 15 }, 0,
                        Integer.MAX_VALUE, Integer.MIN_VALUE);
        UsingCollectionsSortFindDiffBetweenLargestandSmallest
                .UsingCollectionsSortFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25, 5, 40, 15 });
    }
}
