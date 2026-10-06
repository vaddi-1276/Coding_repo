package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 30, 20, 40, 10, 50]

// Output:
// 10
// 20

class UsingForLoopFindDuplicateElements {
    public static void UsingForLoopFindDuplicateElementsMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                System.out.println(arr[i]);
            }
        }
    }
}

class UsingNestedForLoopFindDuplicateElements {
    public static void UsingNestedForLoopFindDuplicateElementsMethods(int arr[]) {
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

            int count = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

class UsingArrayListFindDuplicateElements {
    public static void UsingArrayListFindDuplicateElementsMethods(int arr[]) {

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

            int count = 1;
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(k) == list.get(i)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(list.get(i));
            }
        }
    }
}

class UsingCollectionsFrequencyFindDuplicateElements {
    public static void UsingNestedForLoopAndCollectionsFrequencyFindDuplicateElementsMethods(int arr[]) {
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
            int count = Collections.frequency(list, list.get(i));

            if (count > 1) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }
}

class UsingRecursionFindDuplicateElements {
    public static void UsingRecursionFindDuplicateElementsMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        boolean isduplicate = false;

        for (int j = 0; j < index; j++) {
            if (arr[index] == arr[j]) {
                isduplicate = true;
                break;
            }
        }

        if (isduplicate == false) {
            int count = 1;

            for (int k = index + 1; k < arr.length; k++) {
                if (arr[k] == arr[index]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(arr[index] + " ");
            }
        }

        UsingRecursionFindDuplicateElementsMethods(arr, index + 1);
    }
}

public class FindDuplicateElements {
    public static void main(String[] args) {

        // UsingForLoopFindDuplicateElements
        // .UsingForLoopFindDuplicateElementsMethods(new int[] { 10, 20, 30, 30, 20, 40,
        // 10, 50, 40 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        UsingNestedForLoopFindDuplicateElements
                .UsingNestedForLoopFindDuplicateElementsMethods(new int[] { 10, 20, 30, 20,
                        40, 10, 50 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingArrayListFindDuplicateElements
        // .UsingArrayListFindDuplicateElementsMethods(new int[] { 60, 60, 70, 70, 70,
        // 70, 80, 100, 100, 100 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        UsingCollectionsFrequencyFindDuplicateElements
                .UsingNestedForLoopAndCollectionsFrequencyFindDuplicateElementsMethods(
                        new int[] { 10, 20, 30, 20, 40, 10, 50 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindDuplicateElements
                .UsingRecursionFindDuplicateElementsMethods(new int[] { 10, 20, 30, 20, 40, 10, 50 }, 0);

        System.out.println();

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
