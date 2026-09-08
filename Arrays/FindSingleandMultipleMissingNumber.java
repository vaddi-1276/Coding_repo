package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [1, 2, 3, 5, 6]

// Output:
// 4

class UsingNestedForLoopFindSingleandMultipleMissingNumber {

    public static void UsingNestedForLoopFindSingleandMultipleMissingNumberMethods(int arr[]) {

        Arrays.sort(arr);
        int value = arr[arr.length - 1];

        for (int i = 1; i <= value; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
            }
        }
    }
}

class UsingArrayListFindSingleandMultipleMissingNumber {
    public static void UsingArrayListFindSingleandMultipleMissingNumberMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int max = list.get(list.size() - 1);

        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(i);
            }
        }
    }
}

class UsingRecursionFindSingleandMultipleMissingNumber {
    public static void UsingRecursionFindSingleandMultipleMissingNumberMethods(int arr[], int index) {
        int max = arr[arr.length - 1];

        if (index > max) {
            return;
        }
        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == index) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(index);
        }

        UsingRecursionFindSingleandMultipleMissingNumberMethods(arr, index + 1);
    }
}

public class FindSingleandMultipleMissingNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindSingleandMultipleMissingNumber
                .UsingNestedForLoopFindSingleandMultipleMissingNumberMethods(new int[] { 1, 2, 3, 5, 6, 9 });
        UsingArrayListFindSingleandMultipleMissingNumber
                .UsingArrayListFindSingleandMultipleMissingNumberMethods(new int[] { 1, 2, 3, 5, 6, 9 });
        UsingRecursionFindSingleandMultipleMissingNumber
                .UsingRecursionFindSingleandMultipleMissingNumberMethods(new int[] { 1, 2, 5, 6, 9 }, 1);
    }
}
