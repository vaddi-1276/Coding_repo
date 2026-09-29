package Arrays_and_Strings;

import java.util.Arrays;

// Input

// 12, -5, 7, -2, 18, -9, 4

// Output

// -5, -2, -9, 12, 7, 18, 4

class WithExtraArrayMoveAllNegativeNumberstotheBeginning {
    public static void WithExtraArrayMoveAllNegativeNumberstotheBeginningMethods(int arr[]) {

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

public class MoveAllNegativeNumberstotheBeginning {
    public static void main(String[] args) {
        WithExtraArrayMoveAllNegativeNumberstotheBeginning
                .WithExtraArrayMoveAllNegativeNumberstotheBeginningMethods(new int[] { 12, -5, 7, -2, 18, -9, 4 });
    }
}
