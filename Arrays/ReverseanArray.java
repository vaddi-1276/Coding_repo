package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// [10, 20, 30, 40, 50]

// Output:
// [50, 40, 30, 20, 10]

class UsingArraysSortReverseanArray {
    public static void UsingArraysSortReverseanArrayMethods(int arr[]) {

        Arrays.sort(arr);
        int newarr[] = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingNestedForLoopReverseanArray {
    public static void UsingNestedForLoopReverseanArrayMethods(int arr[]) {

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

        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListCollectionsReverse_ReverseanArray {
    public static void UsingArrayListCollectionsReverse_ReverseanArrayMethods(int arr[]) {

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}

class UsingRecursionReverseanArray {

    public static void UsingRecursionReverseanArrayMethods(int arr[], int index) {

        Arrays.sort(arr);
        if (index == arr.length) {
            return;
        }

        UsingRecursionReverseanArrayMethods(arr, index + 1);

        System.out.print(arr[index] + " ");
    }
}

public class ReverseanArray {
    public static void main(String[] args) {
        UsingArraysSortReverseanArray.UsingArraysSortReverseanArrayMethods(new int[]
        { 10, 20, 30, 40, 50 });
        UsingNestedForLoopReverseanArray.UsingNestedForLoopReverseanArrayMethods(new
        int[] { 20, 10, 40, 30, 50 });
        UsingArrayListCollectionsReverse_ReverseanArray
        .UsingArrayListCollectionsReverse_ReverseanArrayMethods(new int[] { 20, 10,
        40, 30, 50 });
        UsingRecursionReverseanArray.UsingRecursionReverseanArrayMethods(new int[] { 20, 10, 40, 30, 50 }, 0);
        System.out.println();
    }
}
