package Arrays;

import java.util.ArrayList;

// Input: [1, 2, 3, 4, 5, 6]
// Output: 48

class UsingNestedForLoopFindProductofEvenElements {
    public static void UsingNestedForLoopFindProductofEvenElementsMethods(int arr[]) {

        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                product = product * arr[i];
            }
        }
        System.out.println(product);
    }
}

class UsingRecursionFindProductofEvenElements {
    public static void UsingRecursionFindProductofEvenElementsMethods(int arr[], int index, int product) {

        if (index == arr.length) {
            System.out.println(product);
            return;
        }

        if (arr[index] % 2 == 0) {
            product = product * arr[index];
        }
        UsingRecursionFindProductofEvenElementsMethods(arr, index + 1, product);
    }
}

class UsingArrayListFindProductofEvenElements {
    public static void UsingArrayListFindProductofEvenElementsMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                product = product * list.get(i);
            }
        }
        System.out.println(product);
    }
}

public class FindProductofEvenElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindProductofEvenElements
                .UsingNestedForLoopFindProductofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });
        UsingRecursionFindProductofEvenElements
                .UsingRecursionFindProductofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 }, 0, 1);
        UsingArrayListFindProductofEvenElements
                .UsingArrayListFindProductofEvenElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });
    }
}
