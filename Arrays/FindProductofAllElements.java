package Arrays;

import java.util.ArrayList;

// Input: [1, 2, 3, 4]
// Output: 24

class UsingNestedForLoopFindProductofAllElements {

    public static void UsingNestedForLoopFindProductofAllElementsMethods(int arr[]) {

        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println(product);
    }
}

class UsingRecursionFindProductofAllElements {
    public static void UsingRecursionFindProductofAllElementsMethods(int arr[], int product, int index) {

        if (index == arr.length) {
            System.out.println(product);
            return;
        }

        product = product * arr[index];
        UsingRecursionFindProductofAllElementsMethods(arr, product, index + 1);
    }
}

class UsingArrayListFindProductofAllElements {
    public static void UsingArrayListFindProductofAllElementsMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            product = product * list.get(i);
        }

        System.out.println(product);
    }
}

public class FindProductofAllElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindProductofAllElements
                .UsingNestedForLoopFindProductofAllElementsMethods(new int[] { 1, 2, 3, 4 });
        UsingRecursionFindProductofAllElements.UsingRecursionFindProductofAllElementsMethods(new int[] { 1, 2, 3, 4 },
                1, 0);
        UsingArrayListFindProductofAllElements.UsingArrayListFindProductofAllElementsMethods(new int[] { 1, 2, 3, 4 });
    }
}
