package Arrays;

import java.util.ArrayList;

// Input: [2, 7, 11, 15]
// Target = 9

// Output:
// 2 + 7 = 9

class UsingNestedForLoopFindPairWithGivenSum {
    public static void UsingNestedForLoopFindPairWithGivenSumMethods(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    return;
                }
            }
        }
        System.out.println("Element are not Found");
    }
}

class UsingArrayListFindPairWithGivenSum {
    public static void UsingArrayListFindPairWithGivenSumMethods(int arr[], int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " = " + target);
                    return;
                }
            }
        }
        System.out.println("Element is not Found");
    }
}

class UsingRecursionFindPairWithGivenSum {
    public static void UsingRecursionFindPairWithGivenSumMethods(int arr[], int index, int target) {

        if (index == arr.length) {
            System.out.println("Element is not Found");
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] + arr[i] == target) {
                System.out.println(arr[index] + " + " + arr[i] + " = " + target);
                return;
            }
        }
        UsingRecursionFindPairWithGivenSumMethods(arr, index + 1, target);
    }
}

public class FindPairWithGivenSum {
    public static void main(String[] args) {
        UsingNestedForLoopFindPairWithGivenSum.UsingNestedForLoopFindPairWithGivenSumMethods(new
        int[] { 2, 7, 11, 15 },
        45);
        UsingArrayListFindPairWithGivenSum.UsingArrayListFindPairWithGivenSumMethods(new
        int[] { 2, 7, 11, 15 }, 18);
        UsingRecursionFindPairWithGivenSum.UsingRecursionFindPairWithGivenSumMethods(new int[] { 2, 7, 11, 15 }, 0, 0);
    }
}
