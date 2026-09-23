package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input: [5, 10, 5, 20, 10, 30, 10]

// Output: 5, 10

class UsingNestedForLoopFindElementsAppearingMoreThanOnce {
    public static void UsingNestedForLoopFindElementsAppearingMoreThanOnceMethods(int arr[]) {
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

class UsingCollectionsFrequencyFindElementsAppearingMoreThanOnce {
    public static void UsingCollectionsFrequencyFindElementsAppearingMoreThanOnceMethods(int arr[]) {

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

class UsingRecursionFindElementsAppearingMoreThanOnce {
    public static void UsingRecursionFindElementsAppearingMoreThanOnceMethods(int arr[], int index) {

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

        if (found == false) {
            int count = 1;
            for (int k = index + 1; k < arr.length; k++) {
                if (arr[k] == arr[index]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[index]);
            }
        }
        UsingRecursionFindElementsAppearingMoreThanOnceMethods(arr, index + 1);
    }
}

public class FindElementsAppearingMoreThanOnce {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementsAppearingMoreThanOnce
                .UsingNestedForLoopFindElementsAppearingMoreThanOnceMethods(new int[] { 5,
                        10, 5, 20, 10, 30, 10 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingCollectionsFrequencyFindElementsAppearingMoreThanOnce
                .UsingCollectionsFrequencyFindElementsAppearingMoreThanOnceMethods(new int[] { 5,
                        10, 5, 20, 10, 30, 10 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingRecursionFindElementsAppearingMoreThanOnce
                .UsingRecursionFindElementsAppearingMoreThanOnceMethods(new int[] { 5,
                        10, 5, 20, 10, 30, 10 }, 0);
    }
}
