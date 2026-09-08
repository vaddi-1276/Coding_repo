package Arrays;

import java.util.ArrayList;

// Input:
// [10, 20, 30, 40, 50]
// Search = 30

// Output:
// Element Found

class UsingForLoopSearchanElement {
    public static void UsingForLoopSearchanElementMethods(int arr[], int searchvalue) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchvalue) {
                System.out.println("Element Found by using For Loop");
                return;
            }
        }
        System.out.println("Element is not Found  by using For Loop");
    }
}

class UsingArrayListandUseContainsSearchanElement {
    public static void UsingArrayListandUseContainsSearchanElementMethods(int arr[], int searchvalue) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        if (list.contains(searchvalue)) {
            System.out.println("Element Found by using ArrayList and Contains");
        } else {
            System.out.println("Element is not Found  by using ArrayList and Contains");
        }

    }
}

class usingRecursionSearchanElement {
    public static void usingRecursionSearchanElementMethods(int arr[], int index, int searchvalue) {

        if (index == arr.length) {
            System.out.println("Element is not Found by using Recursion");
            return;
        }

        if (arr[index] == searchvalue) {
            System.out.println("Element is Found by using Recursion");
            return;
        }

        usingRecursionSearchanElementMethods(arr, index + 1, searchvalue);

    }
}

public class SearchanElement {
    public static void main(String[] args) {
        UsingForLoopSearchanElement.UsingForLoopSearchanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 10);
        UsingArrayListandUseContainsSearchanElement
                .UsingArrayListandUseContainsSearchanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 10);
        usingRecursionSearchanElement.usingRecursionSearchanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 0, 10);
    }
}
