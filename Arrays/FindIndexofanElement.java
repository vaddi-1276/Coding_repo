package Arrays;

import java.util.ArrayList;

// Input:
// [10, 20, 30, 40, 50]
// Search = 40

// Output:
// Index = 3

class UsingForLoopFindIndexofanElement {
    public static void UsingForLoopFindIndexofanElementMethods(int arr[], int searchvalue) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchvalue) {
                System.out.println("Index = " + i);
                return;
            }
        }
        System.out.println("Element is not found");
    }
}

class UsingArrayListFindIndexofanElement {
    public static void UsingArrayListFindIndexofanElementMethods(int arr[], int searchvalue) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchvalue) {
                System.out.println("Index = " + i);
                return;
            }
        }
        System.out.println("Element is not Found");
    }
}

class UsingRecursionFindIndexofanElement {
    public static void UsingRecursionFindIndexofanElementMethods(int arr[], int index, int searchvalue) {

        if (index == arr.length) {
            System.out.println("Element is not Found");
            return;
        }

        if (arr[index] == searchvalue) {
            System.out.println("Index = " + index);
            return;
        }
        UsingRecursionFindIndexofanElementMethods(arr, index + 1, searchvalue);
    }
}

public class FindIndexofanElement {
    public static void main(String[] args) {
        UsingForLoopFindIndexofanElement.UsingForLoopFindIndexofanElementMethods(new int[] { 10, 20, 30, 40, 50 }, 30);
        UsingArrayListFindIndexofanElement.UsingArrayListFindIndexofanElementMethods(new int[] { 10, 20, 30, 40, 50 },
                40);
        UsingRecursionFindIndexofanElement.UsingRecursionFindIndexofanElementMethods(new int[] { 10, 20, 30, 40, 50 },
                0, 50);
    }
}
