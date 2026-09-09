package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [1, 0, 3, 0, 5]

// Output:
// [0, 0, 1, 3, 5]

class UsingNestedForLoopMoveAllZerostoBeginning {
    public static void UsingNestedForLoopMoveAllZerostoBeginningMethods(int arr[]) {

        int index = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newarr[index++] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newarr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListMoveAllZerostoBeginning {
    public static void UsingArrayListMoveAllZerostoBeginningMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int index = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 0) {
                newarr[index++] = 0;
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != 0) {
                newarr[index++] = list.get(i);
            }
        }

        System.out.println(Arrays.toString(newarr));
    }
}

class WithoutUsingExtraArrayMoveAllZerostoBeginning {
    public static void WithoutUsingExtraArrayMoveAllZerostoBeginningMethods(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] != 0) {
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

public class MoveAllZerostoBeginning {
    public static void main(String[] args) {
        UsingNestedForLoopMoveAllZerostoBeginning
        .UsingNestedForLoopMoveAllZerostoBeginningMethods(new int[] { 1, 0, 3, 0, 5
        });
        UsingArrayListMoveAllZerostoBeginning
        .UsingArrayListMoveAllZerostoBeginningMethods(new int[] { 1, 0, 3, 0, 5, 0,
        0, 0 });
        WithoutUsingExtraArrayMoveAllZerostoBeginning
                .WithoutUsingExtraArrayMoveAllZerostoBeginningMethods(new int[] { 1, 0, 3, 0, 5, 0, 0 });
    }
}
