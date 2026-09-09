package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [-1, 5, -3, 8, -2, 10]

// Output:
// [5, 8, 10, -1, -3, -2]

class UsingNestedForLoopMovePositiveNumberstoOneSide {
    public static void UsingNestedForLoopMovePositiveNumberstoOneSideMethods(int arr[]) {

        int index = 0;
        int newarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newarr[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newarr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListMovePositiveNumberstoOneSide {
    public static void UsingArrayListMovePositiveNumberstoOneSideMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int index = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                newarr[index++] = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                newarr[index++] = list.get(i);
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class WithoutExtraArrayMovePositiveNumberstoOneSide {
    public static void WithoutExtraArrayMovePositiveNumberstoOneSideMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <=0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] >= 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class MovePositiveNumberstoOneSide {
    public static void main(String[] args) {
        UsingNestedForLoopMovePositiveNumberstoOneSide
        .UsingNestedForLoopMovePositiveNumberstoOneSideMethods(new int[] { -1, 5, -3,
        8, -2, 10 });
        UsingArrayListMovePositiveNumberstoOneSide
        .UsingArrayListMovePositiveNumberstoOneSideMethods(new int[] { -1, 5, -3, 8,
        -2, 10 });
        WithoutExtraArrayMovePositiveNumberstoOneSide
                .WithoutExtraArrayMovePositiveNumberstoOneSideMethods(new int[] { -1, 5, -3, 8, 0, -2, 10 });
    }
}
