package Arrays;

import java.util.Arrays;

// Input:
// [1, 2, 3, 4, 5]
// N = 2

// Output:
// [4, 5, 1, 2, 3]

class UsingNestedForLoopRightRotateArraybyNPositions {
    public static void UsingNestedForLoopRightRotateArraybyNPositionsMethods(int arr[], int value) {

        if (value > arr.length) {
            System.out.println("Value is Exceed");
            return;
        }
        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - value; i < arr.length; i++) {
            newarr[index++] = arr[i];
        }
        for (int i = 0; i < arr.length - value; i++) {
            newarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class WithoutUsingExtraArrayRightRotateArraybyNPositions {
    public static void WithoutUsingExtraArrayRightRotateArraybyNPositionsMethods(int arr[], int value ) {

        if (value > arr.length) {
            System.out.println("Value is Exceed");
            return;
        }

        for (int i = 0; i < value; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class RightRotateArraybyNPositions {
    public static void main(String[] args) {
        UsingNestedForLoopRightRotateArraybyNPositions
                .UsingNestedForLoopRightRotateArraybyNPositionsMethods(new int[] { 1, 2, 3, 4, 5 }, 9);

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        WithoutUsingExtraArrayRightRotateArraybyNPositions
                .WithoutUsingExtraArrayRightRotateArraybyNPositionsMethods(new int[] { 1, 2, 3, 4, 5 }, 9);
    }
}
