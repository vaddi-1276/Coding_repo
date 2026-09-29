package Arrays_and_Strings;

import java.util.Arrays;

// Input

// 8, 0, 3, 0, 5, 2, 0, 9

// Output

// 8, 3, 5, 2, 9, 0, 0, 0

class UsingExtraArrayMoveAllZerostotheEnd {
    public static void UsingExtraArrayMoveAllZerostotheEndMethods(int arr[]) {

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

class WithoutExtraArrayMoveAllZerostotheEnd {
    public static void WithoutExtraArrayMoveAllZerostotheEndMethods(int arr[]) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class MoveAllZerostotheEnd {
    public static void main(String[] args) {
        UsingExtraArrayMoveAllZerostotheEnd
                .UsingExtraArrayMoveAllZerostotheEndMethods(new int[] { 8, 0, 3, 0, 5, 2, 0, 9 });

        WithoutExtraArrayMoveAllZerostotheEnd
                .WithoutExtraArrayMoveAllZerostotheEndMethods(new int[] { 8, 0, 3, 0, 5, 2, 0, 9 });
    }
}
