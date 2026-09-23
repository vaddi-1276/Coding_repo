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
                System.out.println("Element Found");
                return;
            }
        }
        System.out.println("Element is not Found");
    }
}

class UsingArrayListandUseContainsSearchanElement {
    public static void UsingArrayListandUseContainsSearchanElementMethods(int arr[], int searchvalue) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(searchvalue)) {
                System.out.println("Element is Found");
                return;
            }
        }
        System.out.println("Element is not Found");
    }
}

class usingRecursionSearchanElement {
    public static void usingRecursionSearchanElementMethods(int arr[], int index, int searchvalue) {

        if (index == arr.length) {
            System.out.println("Element is not Found");
            return;
        }

        if (arr[index] == searchvalue) {
            System.out.println("Element is Found");
            return;
        }
        usingRecursionSearchanElementMethods(arr, index + 1, searchvalue);
    }
}

public class SearchanElement {
    public static void main(String[] args) {
        UsingForLoopSearchanElement.UsingForLoopSearchanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 10);

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingArrayListandUseContainsSearchanElement
                .UsingArrayListandUseContainsSearchanElementMethods(new int[] { 10, 20, 30,
                        40, 50 }, 10);

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        usingRecursionSearchanElement.usingRecursionSearchanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 0, 10);
    }
}
