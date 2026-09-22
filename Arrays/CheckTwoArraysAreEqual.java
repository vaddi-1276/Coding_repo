package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [1, 2, 4, 3]

// Output:
// Not Equal

class UsingNestedForLoopCheckTwoArraysAreEqual {
    public static void UsingNestedForLoopCheckTwoArraysAreEqualMethods(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length) {
            System.out.println("Arrays size is not Equal");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays inside the values are not equals");
                return;
            }
        }
        System.out.println("Arrays size and inside values are Equals");
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
            System.out.println("Arrays length is not Equals");
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

class UsingRecursionCheckTwoArraysAreEqual {
    public static void UsingRecursionCheckTwoArraysAreEqualMethods(int arr1[], int arr2[], int index) {

        if (arr1.length != arr2.length) {
            System.out.println("Arrays Length is not Equal");
            return;
        }

        if (arr1[index] != arr2[index]) {
            System.out.println("Arrays values are not Equal");
            return;
        }
        if (index == arr1[index]) {
            System.out.println("Array values are Equals");
            return;
        }
        UsingRecursionCheckTwoArraysAreEqualMethods(arr1, arr2, index + 1);
    }
}

class UsingArraysEqualsCheckTwoArraysAreEqual {
    public static void UsingArraysEqualsCheckTwoArraysAreEqualMethods(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length) {
            System.out.println("Two Arrays Length are not Equal");
            return;
        }

        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not Equals");
        }
    }
}

public class CheckTwoArraysAreEqual {
    public static void main(String[] args) {
        // UsingNestedForLoopCheckTwoArraysAreEqual
        // .UsingNestedForLoopCheckTwoArraysAreEqualMethods(new int[] { 1, 2, 3, 4 },
        // new int[] { 1, 2, 3, 4 });
        // UsingArrayListCheckTwoArraysAreEqual.UsingArrayListCheckTwoArraysAreEqualMethods(new
        // int[] { 1, 2, 3, 4 },
        // new int[] { 1, 2, 3, 4 });
        // UsingRecursionCheckTwoArraysAreEqual.UsingRecursionCheckTwoArraysAreEqualMethods(new
        // int[] { 1, 2, 3, 4 },
        // new int[] { 1, 2, 4, 3 }, 0);
        UsingArraysEqualsCheckTwoArraysAreEqual.UsingArraysEqualsCheckTwoArraysAreEqualMethods(new int[] { 1, 2, 3, 4 },
                new int[] { 1, 2, 4, 4 });
    }
}
