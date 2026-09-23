package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [0, 1, 0, 3, 12]

// Output:
// [1, 3, 12, 0, 0]

class UsingNestedForLoopMoveAllZerostoEnd {
    public static void UsingNestedForLoopMoveAllZerostoEndMethods(int arr[]) {

        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newarr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            newarr[index++] = 0;
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListMoveAllZerostoEnd {
    public static void UsingArrayListMoveAllZerostoEndMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int index = 0;
        int newarr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                newarr[index++] = list.get(i);
            }
        }

        while (index < list.size()) {
            newarr[index++] = 0;
        }

        System.out.println(Arrays.toString(newarr));
    }
}

class WithoutUsingExtraArrayMoveAllZerostoEnd {
    public static void WithoutUsingExtraArrayMoveAllZerostoEndMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
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

public class MoveAllZerostoEnd {
    public static void main(String[] args) {
        UsingNestedForLoopMoveAllZerostoEnd.UsingNestedForLoopMoveAllZerostoEndMethods(new
        int[] { 0, 1, 0, 3, 12 });

        System.out.println(
        "----------------------------------------------------------------------------------------------");

        UsingArrayListMoveAllZerostoEnd.UsingArrayListMoveAllZerostoEndMethods(new
        int[] { 0, 1, 0, 3, 12 });

        System.out.println(
        "----------------------------------------------------------------------------------------------");

        WithoutUsingExtraArrayMoveAllZerostoEnd
                .WithoutUsingExtraArrayMoveAllZerostoEndMethods(new int[] { 0, 1, 0, 3, 12
                });

        System.out.println(
                "----------------------------------------------------------------------------------------------");
    }
}
