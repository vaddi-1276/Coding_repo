package Arrays;

import java.util.Arrays;

// Input:
// [5, -1, 8, -3, 10, -2]

// Output:
// [-1, -3, -2, 5, 8, 10]

class WithoutUsingExtraArrayMoveNegativeNumberstoOneSide {

    public static void WithoutUsingExtraArrayMoveNegativeNumberstoOneSideMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < 0) {
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

public class MoveNegativeNumberstoOneSide {
    public static void main(String[] args) {
        WithoutUsingExtraArrayMoveNegativeNumberstoOneSide
                .WithoutUsingExtraArrayMoveNegativeNumberstoOneSideMethods(new int[] { 5, -1, 8, -3, 10, -2 });
    }
}


