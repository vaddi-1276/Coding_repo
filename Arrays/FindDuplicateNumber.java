package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [1, 3, 4, 2, 2]

// Output:
// 2

class UsingForLoopFindDuplicateNumber {
    public static void UsingForLoopFindDuplicateNumberMethods(int arr[]) {

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

class UsingNestedForLoopFindDuplicateNumber {
    public static void UsingNestedForLoopFindDuplicateNumberMethods(int arr[]) {

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

class UsingCollectionsFrequencyFindDuplicateNumber {
    public static void UsingCollectionsFrequencyFindDuplicateNumberMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            boolean isduplicate = false;

            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    isduplicate = true;
                    break;
                }
            }

            if (isduplicate) {
                continue;
            }

            int count = Collections.frequency(list, list.get(i));

            if (count > 1) {
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();
    }
}

class UsingRecursionFindDuplicateNumber {

    public static void UsingRecursionFindDuplicateNumberMethods(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        boolean found = false;
        for (int j = 0; j < index; j++) {

            if (arr[index] == arr[j]) {
                found = true;
                break;
            }
        }
        if (found) {
            UsingRecursionFindDuplicateNumberMethods(arr, index + 1);
            return;
        }
        int count = 1;
        for (int k = index + 1; k < arr.length; k++) {
            if (arr[k] == arr[index]) {
                count++;
            }
        }
        if (count > 1) {
            System.out.print(arr[index] + " ");
        }
        UsingRecursionFindDuplicateNumberMethods(arr, index + 1);
    }

}

public class FindDuplicateNumber {
    public static void main(String[] args) {

        // UsingForLoopFindDuplicateNumber.UsingForLoopFindDuplicateNumberMethods(new
        // int[] { 1, 3, 4, 2, 2 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        UsingNestedForLoopFindDuplicateNumber
                .UsingNestedForLoopFindDuplicateNumberMethods(new int[] { 1, 3, 4, 2, 2, 3 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingCollectionsFrequencyFindDuplicateNumber
                .UsingCollectionsFrequencyFindDuplicateNumberMethods(new int[] { 1, 3, 4, 4,
                        5, 2, 2 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindDuplicateNumber.UsingRecursionFindDuplicateNumberMethods(new int[] { 1, 3, 4, 4, 5, 2, 2 },
                0);

        System.out.println();

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
