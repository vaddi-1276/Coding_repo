package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

// Input:
// [10, 20, 10, 30, 20, 40]

// Output:
// [10, 20, 30, 40]

class UsingForLoopRemoveDuplicateElements {
    public static void UsingForLoopRemoveDuplicateElementsMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            System.out.println(arr[i] + " ");
        }
    }
}

class UsingNestedForLoopRemoveDuplicateElements {
    public static void UsingNestedForLoopRemoveDuplicateElementsMethods(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            System.out.println(arr[i] + " ");
        }
    }
}

class UsingArrayListRemoveDuplicateElements {
    public static void UsingArrayListRemoveDuplicateElementsmethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

class UsingHashSetRemoveDuplicateElements {
    public static void UsingHashSetRemoveDuplicateElementsMethods(int arr[]) {

        Arrays.sort(arr);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}

class UsingRecursionRemoveDuplicateElements {
    public static void UsingRecursionRemoveDuplicateElementsMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (arr[index] == arr[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            UsingRecursionRemoveDuplicateElementsMethods(arr, index + 1);
            return;
        }
        System.out.println(arr[index]);
        UsingRecursionRemoveDuplicateElementsMethods(arr, index + 1);
    }
}

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        UsingForLoopRemoveDuplicateElements
                .UsingForLoopRemoveDuplicateElementsMethods(new int[] { 10, 20, 10, 30, 20,
                        40 });
        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingNestedForLoopRemoveDuplicateElements
                .UsingNestedForLoopRemoveDuplicateElementsMethods(new int[] { 10, 20, 10, 30,
                        20, 40 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");
        UsingArrayListRemoveDuplicateElements
                .UsingArrayListRemoveDuplicateElementsmethods(new int[] { 10, 20, 10, 30, 20,
                        40 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");
        UsingHashSetRemoveDuplicateElements
                .UsingHashSetRemoveDuplicateElementsMethods(new int[] { 10, 20, 10, 30, 20,
                        40 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingRecursionRemoveDuplicateElements
                .UsingRecursionRemoveDuplicateElementsMethods(new int[] { 10, 20, 10, 30, 20,
                        40 }, 0);

    }
}
