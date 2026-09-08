package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 30, 20, 40, 10, 50]

// Output:
// 10
// 20

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
                System.out.println(arr[i]);
            }
        }
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
                System.out.println(list.get(i));
            }
        }
    }
}

public class FindDuplicateElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindDuplicateElements
                .UsingNestedForLoopFindDuplicateElementsMethods(new int[] { 10, 20, 30, 20, 40, 10, 50 });
        UsingArrayListFindDuplicateElements
                .UsingArrayListFindDuplicateElementsMethods(new int[] { 60, 60, 70, 70, 70, 70, 80, 100, 100, 100 });
        UsingCollectionsFrequencyFindDuplicateElements
                .UsingNestedForLoopAndCollectionsFrequencyFindDuplicateElementsMethods(
                        new int[] { 10, 20, 30, 20, 40, 10, 50 });
    }
}
