package Arrays;

import java.util.Arrays;

// Input:
// [5, -1, 8, -3, 10, -2]

// Output:
// [-1, -3, -2, 5, 8, 10]

class UsingForLoopMoveNegativeNumberstoOneSide {
    public static void UsingForLoopMoveNegativeNumberstoOneSideMethods(int arr[]) {

        int newarr[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newarr[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newarr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingRecursionMoveNegativeNumberstoOneSide {
    public static void UsingRecursionMoveNegativeNumberstoOneSideMethods(int arr[], int newarr[], int index,
            int newindex) {

        if (index == arr.length) {
            MovePositivetoEnd(arr, newarr, 0, newindex);
            System.out.println(Arrays.toString(newarr));
            return;
        }

        if (arr[index] < 0) {
            newarr[newindex++] = arr[index];
        }
        UsingRecursionMoveNegativeNumberstoOneSideMethods(arr, newarr, index + 1, newindex);
    }

    public static void MovePositivetoEnd(int arr[], int newarr[], int index, int newindex) {

        if (index == arr.length) {
            return;
        }
        if (arr[index] > 0) {
            newarr[newindex++] = arr[index];
        }
        MovePositivetoEnd(arr, newarr, index + 1, newindex);
    }
}

class WithoutNewArrayMoveNegativeNumberstoOneSide {
    public static void WithoutNewArrayMoveNegativeNumberstoOneSideMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = i; j > 0; j--) {
                    if (arr[j - 1] > 0) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class MoveNegativeNumberstoOneSide {
    public static void main(String[] args) {

        UsingForLoopMoveNegativeNumberstoOneSide
                .UsingForLoopMoveNegativeNumberstoOneSideMethods(new int[] { 5, -1, 8, -3, 10, -2 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        int arr[] = { 5, -1, 8, -3, 10, -2 };
        UsingRecursionMoveNegativeNumberstoOneSide.UsingRecursionMoveNegativeNumberstoOneSideMethods(arr,
                new int[arr.length], 0, 0);

         System.out.println(
                "----------------------------------------------------------------------------------------------");

        WithoutNewArrayMoveNegativeNumberstoOneSide.WithoutNewArrayMoveNegativeNumberstoOneSideMethods(arr);
    }
}
