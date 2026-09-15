package Arrays;

import java.util.ArrayList;

// Input:
// [0, 5, 0, 10, 2, 0, 8]

// Output:
// 3

class UsingForLoopCountZeros {
    public static void UsingForLoopCountZerosMethods(int arr[]) {

        int countofzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countofzero++;
            }
        }
        System.out.println("Using For Loop count of Zero " + countofzero);
    }
}

class UsingArrayListCountZeros {
    public static void UsingArrayListCountZerosMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int countofzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (list.get(i) == 0) {
                countofzero++;
            }
        }
        System.out.println("Using Array List count of Zero " + countofzero);
    }
}

class UsingRecursionCountZeros {
    public static void UsingRecursionCountZerosMethods(int arr[], int index, int countofzero) {

        if (index == arr.length) {
            System.out.println("Using Recursion count of Zero " + countofzero);
            return;
        }

        if (arr[index] == 0) {
            countofzero++;
        }
        UsingRecursionCountZerosMethods(arr, index + 1, countofzero);
    }
}

public class CountZeros {
    public static void main(String[] args) {
        UsingForLoopCountZeros.UsingForLoopCountZerosMethods(new int[] { 0, 5, 0, 10, 2, 0, 8 });
        UsingArrayListCountZeros.UsingArrayListCountZerosMethods(new int[] { 0, 5, 0, 10, 2, 0, 8, 0 });
        UsingRecursionCountZeros.UsingRecursionCountZerosMethods(new int[] { 0, 5, 0, 10, 2, 0, 8, 0, 0 }, 0, 0);
    }
}
