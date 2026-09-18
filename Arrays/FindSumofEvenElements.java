package Arrays;

import java.util.ArrayList;

// Input: [1, 2, 3, 4, 5, 6]
// Output: 12

class UsingNestedForLoopFindSumofEvenElements {
    public static void UsingNestedForLoopFindSumofEvenElementsMethods(int arr[]) {
        int evensum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evensum = evensum + arr[i];
            }
        }
        System.out.println(evensum);
    }
}

class UsingArrayListFindSumofEvenElements {
    public static void UsingArrayListFindSumofEvenElementsMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int evensum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evensum = evensum + list.get(i);
            }
        }
        System.out.println(evensum);
    }
}

class UsingRecursionFindSumofEvenElements {
    public static void UsingRecursionFindSumofEvenElementsMethods(int arr[], int evencount, int index) {

        if (index == arr.length) {
            System.out.println(evencount);
            return;
        }

        if (arr[index] % 2 == 0) {
           evencount=evencount+arr[index];
        }

        UsingRecursionFindSumofEvenElementsMethods(arr, evencount, index + 1);
    }
}

public class FindSumofEvenElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindSumofEvenElements
                .UsingNestedForLoopFindSumofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });
        UsingArrayListFindSumofEvenElements
                .UsingArrayListFindSumofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        UsingRecursionFindSumofEvenElements
                .UsingRecursionFindSumofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0, 0);
    }
}
