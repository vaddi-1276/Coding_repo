package Arrays;

import java.util.ArrayList;

// Input: [10, 20, 30, 40, 50, 60]
// Output: 120

class UsingNestedForLoopFindSumofElementsatOddIndex {
    public static void UsingNestedForLoopFindSumofElementsatOddIndexMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

class UsingRecursionFindSumofElementsatOddIndex {
    public static void UsingRecursionFindSumofElementsatOddIndexMethods(int arr[], int index, int sum) {

        if (index == arr.length) {
            System.out.println(sum);
            return;
        }

        if (index % 2 != 0) {
            sum = sum + arr[index];
        }
        UsingRecursionFindSumofElementsatOddIndexMethods(arr, index + 1, sum);
    }
}

class UsingArrayListFindSumofElementsatOddIndex {
    public static void UsingArrayListFindSumofElementsatOddIndexMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                sum = sum + list.get(i);
            }
        }
        System.out.println(sum);
    }
}

public class FindSumofElementsatOddIndex {
    public static void main(String[] args) {
        UsingNestedForLoopFindSumofElementsatOddIndex
                .UsingNestedForLoopFindSumofElementsatOddIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 });
        UsingRecursionFindSumofElementsatOddIndex
                .UsingRecursionFindSumofElementsatOddIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 }, 0, 0);
        UsingArrayListFindSumofElementsatOddIndex
                .UsingArrayListFindSumofElementsatOddIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 });
    }
}
