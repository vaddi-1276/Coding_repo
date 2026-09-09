package Arrays;

import java.util.ArrayList;

// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [1, 2, 4, 3]

// Output:
// Not Equal

class UsingNestedForLoopCheckTwoArraysAreEqual {
    public static void UsingNestedForLoopCheckTwoArraysAreEqualMethods(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length) {
            System.out.println("Arrays Length are not Equals");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays Inside Values are not Equal");
                return;
            }
        }
        System.out.println("Equals");
    }
}

class UsingArrayListCheckTwoArraysAreEqual {
    public static void UsingArrayListCheckTwoArraysAreEqualMethods(int arr1[], int arr2[]) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        if (list1.size() != list2.size()) {
            System.out.println("Arrays Length are not Equals");
            return;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                System.out.println("Arrays inside values are not Equals");
                return;
            }
        }
        System.out.println("Arrays are Equals");
    }
}

public class CheckTwoArraysAreEqual {
    public static void main(String[] args) {
        // UsingNestedForLoopCheckTwoArraysAreEqual
        // .UsingNestedForLoopCheckTwoArraysAreEqualMethods(new int[] { 1, 2, 3, 4 },
        // new int[] { 1, 2, 3 });
        UsingArrayListCheckTwoArraysAreEqual.UsingArrayListCheckTwoArraysAreEqualMethods(new int[] { 1, 2, 3, 4 },
                new int[] { 1, 2, 3 });
    }
}
