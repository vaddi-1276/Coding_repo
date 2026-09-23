package Arrays;

import java.util.ArrayList;

// Input:
// [-5, 10, -3, 8, 0, -2]

// Output:
// Positive = 2
// Negative = 3

class UsingForLoopCountPositiveandNegativeNumbers {
    public static void UsingForLoopCountPositiveandNegativeNumbersMethods(int arr[]) {
        int positivecount = 0;
        int negativecount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positivecount++;
            } else if (arr[i] < 0) {
                negativecount++;
            }
        }
        System.out.println("Positive Count using For Loop = " + positivecount);
        System.out.println("Negative Count using For Loop = " + negativecount);
    }
}

class UsingArrayListCountPositiveandNegativeNumbers {
    public static void UsingArrayListCountPositiveandNegativeNumbersMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int positivecount = 0;
        int negativecount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                positivecount++;
            } else {
                negativecount++;
            }
        }
        System.out.println("Positive Count using ArrayList = " + positivecount);
        System.out.println("Negative Count using ArrayList = " + negativecount);
    }
}

class UsingRecursionCountPositiveandNegativeNumbers {
    public static void UsingRecursionCountPositiveandNegativeNumbersMethods(int arr[], int index, int positivecount,
            int negativecount) {

        if (index == arr.length) {
            System.out.println("Positive Count using Recursion = " + positivecount);
            System.out.println("Negative Count using Recursion = " + negativecount);
            return;
        }

        if (arr[index] > 0) {
            positivecount++;
        } else if (arr[index] < 0) {
            negativecount++;
        }
        UsingRecursionCountPositiveandNegativeNumbersMethods(arr, index+1, positivecount, negativecount);
    }
}

public class CountPositiveandNegativeNumbers {
    public static void main(String[] args) {
        UsingForLoopCountPositiveandNegativeNumbers
                .UsingForLoopCountPositiveandNegativeNumbersMethods(new int[] { -5, 10, -3, 8, 0, -2 });
        UsingArrayListCountPositiveandNegativeNumbers
                .UsingArrayListCountPositiveandNegativeNumbersMethods(new int[] { -5, 10, -3,
                        8, 0, -2, -9, 11, -10 });
        UsingRecursionCountPositiveandNegativeNumbers.UsingRecursionCountPositiveandNegativeNumbersMethods(
                new int[] { -5, 10, -3, 8, 0, -2, -9, 11, -10 }, 0, 0,
                0);
    }
}
