package Arrays;

// Input: [10, 20, 30, 40, 50]
// Output: Sorted

import java.util.Arrays;

class UsingNestedForLoopCheckArrayIsSorted {
    public static void UsingNestedForLoopCheckArrayIsSortedMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    System.out.println(" Not Sorted");
                    return;
                }
            }
        }
        System.out.println("Sorted");
    }
}

class UsingRecursionCheckArrayIsSorted {

    public static void UsingRecursionCheckArrayIsSortedMethods(int arr[], int index) {

        if (index == arr.length) {
            System.out.println("Sorted");
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                System.out.println("Not Sorted");
                return;
            }
        }
        UsingRecursionCheckArrayIsSortedMethods(arr, index + 1);
    }
}

class UsingArrayCloneCheckArrayIsSorted {
    public static void UsingArrayCloneCheckArrayIsSortedMethods(int arr[]) {

        int clonearray[] = arr.clone();
        Arrays.sort(clonearray);
        if (Arrays.equals(clonearray, arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        UsingNestedForLoopCheckArrayIsSorted
                .UsingNestedForLoopCheckArrayIsSortedMethods(new int[] { 10, 30, 20, 40, 50
                });
        UsingRecursionCheckArrayIsSorted.UsingRecursionCheckArrayIsSortedMethods(new int[] { 10, 20, 30, 40, 50 }, 0);
        UsingArrayCloneCheckArrayIsSorted.UsingArrayCloneCheckArrayIsSortedMethods(new int[] { 10, 20, 30, 40, 50 });
    }
}
