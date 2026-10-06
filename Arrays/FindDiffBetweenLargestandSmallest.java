package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input: [10, 25, 5, 40, 15]
// Output: 35

class UsingArraysSortFindDiffBetweenLargestandSmallest {
    public static void UsingArraysSortFindDiffBetweenLargestandSmallestMethods(int arr[]) {

        Arrays.sort(arr);
        int smalllestvalue = arr[0];
        int largestvalue = arr[arr.length - 1];

        int difference = largestvalue - smalllestvalue;
        System.out.println(difference);
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
        int min = arr[0];
        int max = arr[arr.length - 1];
        int diff = Math.abs(min - max);

        System.out.println(diff);
    }
}

class UsingRecursionFindDiffBetweenLargestandSmallest {
    public static void UsingRecursionFindDiffBetweenLargestandSmallestMethods(int arr[], int index) {
        if (index == arr.length) {
            int smallestvalue = arr[0];
            int largestvalue = arr[arr.length - 1];
            int difference = largestvalue - smallestvalue;
            System.out.println("Difference : " + difference);
            return;
        }
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] > arr[j]) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        UsingRecursionFindDiffBetweenLargestandSmallestMethods(arr, index + 1);
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
                .UsingArraysSortFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25,
                        5, 40, 15 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingNestedForLoopFindDiffBetweenLargestandSmallest
        // .UsingNestedForLoopFindDiffBetweenLargestandSmallestMethods(new int[] { 10,
        // 25, 5, 40, 15, 45 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        UsingRecursionFindDiffBetweenLargestandSmallest
                .UsingRecursionFindDiffBetweenLargestandSmallestMethods(new int[] { 10, 25,
                        5, 40, 15 }, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingCollectionsSortFindDiffBetweenLargestandSmallest
        // .UsingCollectionsSortFindDiffBetweenLargestandSmallestMethods(new int[] { 10,
        // 25, 5, 40, 15 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();
    }
}
