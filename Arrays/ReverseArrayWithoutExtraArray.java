package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// [1, 2, 3, 4, 5]

// Output:
// [5, 4, 3, 2, 1]

class UsingCollectionsReverse_ReverseArrayWithoutExtraArray {
    public static void UsingCollectionsReverse_ReverseArrayWithoutExtraArrayMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

class UsingTempVariableReverseArrayWithoutExtraArray {
    public static void UsingTempVariableReverseArrayWithoutExtraArrayMethods(int arr[]) {

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

class UsingNestedForLoopReverseArrayWithoutExtraArray {
    public static void UsingNestedForLoopReverseArrayWithoutExtraArrayMethods(int arr[]) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class UsingRecursionReverseArrayWithoutExtraArray {
    public static void UsingRecursionReverseArrayWithoutExtraArrayMethods(int arr[], int index) {

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
        UsingRecursionReverseArrayWithoutExtraArrayMethods(arr, index + 1);
    }
}

public class ReverseArrayWithoutExtraArray {
    public static void main(String[] args) {
        UsingCollectionsReverse_ReverseArrayWithoutExtraArray
                .UsingCollectionsReverse_ReverseArrayWithoutExtraArrayMethods(new int[] { 1,
                        2, 3, 4, 5 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingTempVariableReverseArrayWithoutExtraArray
                .UsingTempVariableReverseArrayWithoutExtraArrayMethods(new int[] { 1,
                        2, 3, 4, 5 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingNestedForLoopReverseArrayWithoutExtraArray
                .UsingNestedForLoopReverseArrayWithoutExtraArrayMethods(new int[] { 1, 2, 3,
                        4, 5 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingRecursionReverseArrayWithoutExtraArray
                .UsingRecursionReverseArrayWithoutExtraArrayMethods(new int[] { 1, 2, 3,
                        4, 5 }, 0);
    }
}
