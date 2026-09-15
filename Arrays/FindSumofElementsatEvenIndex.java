package Arrays;

import java.util.ArrayList;

// Input: [10, 20, 30, 40, 50, 60]
// Output: 90

class UsingNestedForLoopFindSumofElementsatEvenIndex {
    public static void UsingNestedForLoopFindSumofElementsatEvenIndexMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

class UsingRecursionFindSumofElementsatEvenIndex {
    public static void UsingRecursionFindSumofElementsatEvenIndexMethods(int arr[], int sum, int index) {

        if (index == arr.length) {
            System.out.println(sum);
            return;
        }

        if (index % 2 == 0) {
            sum = sum + arr[index];
        }
        UsingRecursionFindSumofElementsatEvenIndexMethods(arr, sum, index + 1);
    }
}

class UsingArrayListFindSumofElementsatEvenIndex {
    public static void UsingArrayListFindSumofElementsatEvenIndexMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                sum = sum + list.get(i);
            }
        }
        System.out.println(sum);
    }
}

public class FindSumofElementsatEvenIndex {
    public static void main(String[] args) {
        UsingNestedForLoopFindSumofElementsatEvenIndex
                .UsingNestedForLoopFindSumofElementsatEvenIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 });
        UsingRecursionFindSumofElementsatEvenIndex
                .UsingRecursionFindSumofElementsatEvenIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 }, 0, 0);
        UsingArrayListFindSumofElementsatEvenIndex
                .UsingArrayListFindSumofElementsatEvenIndexMethods(new int[] { 10, 20, 30, 40, 50, 60 });
    }
}
