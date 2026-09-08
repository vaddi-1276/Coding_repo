package Arrays;

import java.util.ArrayList;

// Input:
// [-5, 10, -3, 8, 0, -2]

// Output:
// Positive = 2
// Negative = 3

class UsingForLoopCountPositiveandNegativeNumbers {
    public static void UsingForLoopCountPositiveandNegativeNumbersMethods(int arr[]) {

        int PostiveCount = 0;
        int NegativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PostiveCount++;
            } else if (arr[i] < 0) {
                NegativeCount++;
            }
        }
        System.out.println("Using For Loop Positive Count " + PostiveCount);
        System.out.println("Using For Loop Negative Count " + NegativeCount);
    }
}

class UsingArrayListCountPositiveandNegativeNumbers

{
    public static void UsingArrayListCountPositiveandNegativeNumbersMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int arraylistpositivecount = 0;
        int arraylistnegativecount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                arraylistpositivecount++;
            }

            else if (list.get(i) < 0) {
                arraylistnegativecount++;
            }
        }

        System.out.println("Using ArrayList Positive Count " + arraylistpositivecount);
        System.out.println("Using ArrayList Negative Count " + arraylistnegativecount);
    }
}

class UsingRecursionCountPositiveandNegativeNumbers {
    public static void UsingRecursionCountPositiveandNegativeNumbersMethods(int arr[], int index,
            int recursionpositivecount, int recursionnegativecount) {

        if (index == arr.length) {
            System.out.println("Using Recursion Positive Count " + recursionpositivecount);
            System.out.println("Using Recursion Negative Count " + recursionnegativecount);
            return;
        }

        if (arr[index] > 0) {
            recursionpositivecount++;
        }

        else if (arr[index] < 0) {
            recursionnegativecount++;
        }

        UsingRecursionCountPositiveandNegativeNumbersMethods(arr, index + 1, recursionpositivecount,
                recursionnegativecount);
    }
}

public class CountPositiveandNegativeNumbers {
    public static void main(String[] args) {
        UsingForLoopCountPositiveandNegativeNumbers
                .UsingForLoopCountPositiveandNegativeNumbersMethods(new int[] { -5, 10, -3, 8, 0, -2 });
        UsingArrayListCountPositiveandNegativeNumbers
                .UsingArrayListCountPositiveandNegativeNumbersMethods(new int[] { -5, 10, -3, 8, 0, -2, -9, 11, -10 });
        UsingRecursionCountPositiveandNegativeNumbers.UsingRecursionCountPositiveandNegativeNumbersMethods(
                new int[] { -5, 10, -3, 8, 0, -2, -9, 11, -10 }, 0, 0,
                0);
    }
}
