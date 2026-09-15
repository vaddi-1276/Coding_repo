package Arrays;

import java.util.ArrayList;

// Input: [1, 2, 3, 4, 5, 6]
// Output: 9

class UsingNestedForLoopFindSumofOddElements {
    public static void UsingNestedForLoopFindSumofOddElementsMethods(int arr[]) {

        int oddsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddsum = oddsum + arr[i];
            }
        }
        System.out.println(oddsum);
    }
}

class UsingRecursionFindSumofOddElements {
    public static void UsingRecursionFindSumofOddElementsMethods(int arr[], int oddsum, int index) {

        if (index == arr.length) {
            System.out.println(oddsum);
            return;
        }

        if (arr[index] % 2 != 0) {
            oddsum = oddsum + arr[index];
        }

        UsingRecursionFindSumofOddElementsMethods(arr, oddsum, index + 1);
    }
}

class UsingArrayListFindSumofOddElements {
    public static void UsingArrayListFindSumofOddElementsMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int oddsum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddsum = oddsum + list.get(i);
            }
        }
        System.out.println(oddsum);
    }
}

public class FindSumofOddElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindSumofOddElements
                .UsingNestedForLoopFindSumofOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });
        UsingRecursionFindSumofOddElements.UsingRecursionFindSumofOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6, 7 },
                0, 0);
        UsingArrayListFindSumofOddElements
                .UsingArrayListFindSumofOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
    }
}
