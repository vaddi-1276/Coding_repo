package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [1, 3, 4, 2, 2]

// Output:
// 2

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
                System.out.println(arr[i]);
            }
        }
    }
}

class UsingCollectionsFrequencyFindDuplicateNumber {
    public static void UsingCollectionsFrequencyFindDuplicateNumberMethods(int arr[]) {

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
                System.out.println(list.get(i));
            }
        }
    }
}

class UsingRecursionFindDuplicateNumber {

    public static void UsingRecursionFindDuplicateNumberMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        boolean found = false;

        // Check whether this element appeared earlier
        for (int i = 0; i < index; i++) {
            if (arr[index] == arr[i]) {
                found = true;
                break;
            }
        }

        // If already processed, skip it
        if (!found) {

            int count = 1;

            // Count remaining occurrences
            for (int k = index + 1; k < arr.length; k++) {
                if (arr[k] == arr[index]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[index]);
            }
        }

        // Recursive call
        UsingRecursionFindDuplicateNumberMethods(arr, index + 1);
    }
}
public class FindDuplicateNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindDuplicateNumber.UsingNestedForLoopFindDuplicateNumberMethods(new int[] { 1, 3, 4, 2, 2 });
        UsingCollectionsFrequencyFindDuplicateNumber
                .UsingCollectionsFrequencyFindDuplicateNumberMethods(new int[] { 1, 3, 4, 4, 5, 2, 2 });
        UsingRecursionFindDuplicateNumber.UsingRecursionFindDuplicateNumberMethods(new int[] { 1, 3, 4, 4, 5, 2, 2 },
                0);
    }
}
