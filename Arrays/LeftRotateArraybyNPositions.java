package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [1, 2, 3, 4, 5]
// N = 2

// Output:
// [3, 4, 5, 1, 2]

class UsingNestedForLoopLeftRotateArraybyNPositions {
    public static void UsingNestedForLoopLeftRotateArraybyNPositionsMethods(int arr[], int value) {

        int index = 0;
        int newarr[] = new int[arr.length];
        for (int i = value; i < arr.length; i++) {
            newarr[index++] = arr[i];
        }

        for (int i = 0; i < value; i++) {
            newarr[index++] = arr[i];
        }

        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListLeftRotateArraybyNPositions {
    public static void UsingArrayListLeftRotateArraybyNPositionsMethods(int arr[], int value) {

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = value; i < list.size(); i++) {
            newarr[index++] = list.get(i);
        }

        for (int i = 0; i < value; i++) {
            newarr[index++] = list.get(i);
        }

        System.out.println(Arrays.toString(newarr));
    }
}

class UsingRecursionLeftRotateArraybyNPositions {
    public static void UsingRecursionLeftRotateArraybyNPositionsMethods(int arr[], int value, int index, int newarr[]) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(newarr));
            return;
        }

        int originalindex = (value + index) % arr.length;

        newarr[index] = arr[originalindex];
        UsingRecursionLeftRotateArraybyNPositionsMethods(arr, value, index + 1, newarr);
    }
}

public class LeftRotateArraybyNPositions {
    public static void main(String[] args) {
        UsingNestedForLoopLeftRotateArraybyNPositions
                .UsingNestedForLoopLeftRotateArraybyNPositionsMethods(new int[] { 1, 2, 3, 4, 5 }, 2);
        UsingArrayListLeftRotateArraybyNPositions
                .UsingArrayListLeftRotateArraybyNPositionsMethods(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 2);

        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        UsingRecursionLeftRotateArraybyNPositions
                .UsingRecursionLeftRotateArraybyNPositionsMethods(arr, 2, 0,
                        new int[arr.length]);
    }
}
