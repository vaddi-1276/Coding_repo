package Arrays;

import java.util.Arrays;

// Input:
// [1, 2, 3, 4, 5]
// N = 2

// Output:
// [4, 5, 1, 2, 3]

class UsingNestedForLoopRightRotateArraybyNPositions {
    public static void UsingNestedForLoopRightRotateArraybyNPositionsMethods(int arr[], int value) {

        int index = 0;
        int newarr[] = new int[arr.length];

        for (int i = arr.length - value; i < arr.length; i++) {
            newarr[index++] = arr[i];
        }

        for (int i = 0; i < arr.length - value; i++) {
            newarr[index++] = arr[i];
        }

        System.out.println(Arrays.toString(newarr));
    }
}

class UsingRecursionRightRotateArraybyNPositions {
    public static void UsingRecursionRightRotateArraybyNPositionsMethods(int arr[], int value, int newarr[],
            int index) {

        if (index == arr.length) {
            System.out.println(Arrays.toString(newarr));
            return;
        }

        int originalvalue = (arr.length - value + index) % arr.length;
        newarr[index] = arr[originalvalue];
        UsingRecursionRightRotateArraybyNPositionsMethods(arr, value, newarr, index + 1);
    }
}

public class RightRotateArraybyNPositions {
    public static void main(String[] args) {
        UsingNestedForLoopRightRotateArraybyNPositions.UsingNestedForLoopRightRotateArraybyNPositionsMethods(new
        int[]{1, 2, 3, 4, 5}, 2);

        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        UsingRecursionRightRotateArraybyNPositions.UsingRecursionRightRotateArraybyNPositionsMethods(arr, 3,
                new int[arr.length], 0);
    }
}
