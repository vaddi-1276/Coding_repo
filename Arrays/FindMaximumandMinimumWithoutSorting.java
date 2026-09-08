package Arrays;

import java.util.Arrays;

// Input:
// [25, 10, 45, 5, 30]

// Output:
// Maximum = 45
// Minimum = 5

class UsingVariablesFindMaximumandMinimumWithoutSorting {
    public static void UsingVariablesFindMaximumandMinimumWithoutSortingMethods(int arr[]) {

        int firstMaximumnumber = Integer.MIN_VALUE;
        int firstMinimumnumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMaximumnumber) {
                firstMaximumnumber = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMinimumnumber) {
                firstMinimumnumber = arr[i];
            }
        }

        System.out.println("Using Variables Maximum = " + firstMaximumnumber);
        System.out.println("Using Variables Mininum = " + firstMinimumnumber);
    }
}

class UsingArraysSortFindMaximumandMinimumWithoutSorting {
    public static void UsingArraysSortFindMaximumandMinimumWithoutSortingMethods(int arr[]) {

        Arrays.sort(arr);

        System.out.println("Using Arrays Sort Maximum = " + arr[arr.length - 1]);
        System.out.println("Using Arrays Sort Minimum = " + arr[0]);
    }
}

class UsingForLoopFindMaximumandMinimumWithoutSorting {
    public static void UsingForLoopFindMaximumandMinimumWithoutSortingMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Using For Loop Maximum = " + arr[arr.length - 1]);
        System.out.println("Using For Loop Minimum = " + arr[0]);
    }
}

class UsingrecursionFindMaximumandMinimumWithoutSorting {
    public static void UsingrecursionFindMaximumandMinimumWithoutSortingMethods(int arr[], int index,
            int firstMaximumnumber, int firstMinimumnumber) {
        if (index == arr.length) {
            System.out.println("Using Recursion First Maximum Number " + firstMaximumnumber);
            System.out.println("Using Recursion First Minimum Number " + firstMinimumnumber);

            return;
        }

        if (arr[index] > firstMaximumnumber) {
            firstMaximumnumber = arr[index];
        }

        if (arr[index] < firstMinimumnumber) {
            firstMinimumnumber = arr[index];
        }
        UsingrecursionFindMaximumandMinimumWithoutSortingMethods(arr, index + 1, firstMaximumnumber,
                firstMinimumnumber);
    }
}

class UsingMathMaxandMathMinFindMaximumandMinimumWithoutSorting {
    public static void UsingMathMaxandMathMinFindMaximumandMinimumWithoutSortingMethods(int arr[]) {

        int firstMaximumnumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            firstMaximumnumber = Math.max(firstMaximumnumber, arr[i]);
        }
        int firstMinimumnumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            firstMinimumnumber = Math.min(firstMinimumnumber, arr[i]);
        }

        System.out.println("Using Math Max First maximum = " + firstMaximumnumber);
        System.out.println("Using Math Min First minimum = " + firstMinimumnumber);
    }
}

public class FindMaximumandMinimumWithoutSorting {
    public static void main(String[] args) {
        UsingVariablesFindMaximumandMinimumWithoutSorting
                .UsingVariablesFindMaximumandMinimumWithoutSortingMethods(new int[] { 25, 10, 45, 5, 30 });
        UsingArraysSortFindMaximumandMinimumWithoutSorting
                .UsingArraysSortFindMaximumandMinimumWithoutSortingMethods(new int[] { 25, 10, 5, 30 });
        UsingForLoopFindMaximumandMinimumWithoutSorting
                .UsingForLoopFindMaximumandMinimumWithoutSortingMethods(new int[] { 25, 10, 5, 30 });
        UsingrecursionFindMaximumandMinimumWithoutSorting
                .UsingrecursionFindMaximumandMinimumWithoutSortingMethods(new int[] { 25, 10, 45, 5, 30 }, 0,
                        Integer.MIN_VALUE, Integer.MAX_VALUE);
        UsingMathMaxandMathMinFindMaximumandMinimumWithoutSorting
                .UsingMathMaxandMathMinFindMaximumandMinimumWithoutSortingMethods(new int[] { 25, 10 });
    }
}
