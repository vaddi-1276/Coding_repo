package Arrays;

import java.util.ArrayList;

// Input: [1, 2, 3, 4, 5]
// Output: 15

class UsingNestedForLoopFindProductofOddElements {
    public static void UsingNestedForLoopFindProductofOddElementsMethods(int arr[]) {

        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                product = product * arr[i];
            }
        }
        System.out.println(product);
    }
}

class UsingRecursionFindProductofOddElements {
    public static void UsingRecursionFindProductofOddElementsMethods(int arr[], int index, int product) {

        if (index == arr.length) {
            System.out.println(product);
            return;
        }

        if (arr[index] % 2 != 0) {
            product = product * arr[index];
        }
        UsingRecursionFindProductofOddElementsMethods(arr, index + 1, product);
    }
}

class UsingArrayListFindProductofOddElements {
    public static void UsingArrayListFindProductofOddElementsMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                product = product * list.get(i);
            }
        }
        System.out.println(product);
    }
}

public class FindProductofOddElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindProductofOddElements
                .UsingNestedForLoopFindProductofOddElementsMethods(new int[] { 1, 2, 3, 4, 5 });
        UsingRecursionFindProductofOddElements
                .UsingRecursionFindProductofOddElementsMethods(new int[] { 1, 2, 3, 4, 5 }, 0, 1);
        UsingArrayListFindProductofOddElements
                .UsingArrayListFindProductofOddElementsMethods(new int[] { 1, 2, 3, 4, 5 });
    }
}
