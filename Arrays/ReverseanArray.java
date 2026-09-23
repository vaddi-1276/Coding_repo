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

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class UsingNestedForLoopReverseanArray {
    public static void UsingNestedForLoopReverseanArrayMethods(int arr[]) {
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

class UsingArrayListCollectionsReverse_ReverseanArray {
    public static void UsingArrayListCollectionsReverse_ReverseanArrayMethods(int arr[]) {

        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

class UsingRecursionReverseanArray {

    public static void UsingRecursionReverseanArrayMethods(int arr[], int index) {

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
        UsingRecursionReverseanArrayMethods(arr, index + 1);
    }
}

public class ReverseanArray {
    public static void main(String[] args) {
        UsingArraysSortReverseanArray.UsingArraysSortReverseanArrayMethods(new int[] { 10, 20, 30, 40, 50 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingNestedForLoopReverseanArray.UsingNestedForLoopReverseanArrayMethods(new int[] { 20, 10, 40, 30, 50 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingArrayListCollectionsReverse_ReverseanArray
                .UsingArrayListCollectionsReverse_ReverseanArrayMethods(new int[] { 20, 10,
                        40, 30, 50 });

        System.out.println(
        "----------------------------------------------------------------------------------------------");

        UsingRecursionReverseanArray.UsingRecursionReverseanArrayMethods(new int[] {
        20, 10, 40, 30, 50 }, 0);
        System.out.println();
    }
}
