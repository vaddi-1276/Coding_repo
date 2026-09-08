package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 10, 30, 20, 40]

// Output:
// 30
// 40

class UsingNestedForLoopFindUniqueElements {
    public static void UsingNestedForLoopFindUniqueElementsMethods(int arr[]) {

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

            if (count == 1) {
                System.out.println("Using Nested For Loop " + arr[i]);
            }
        }
    }
}

class UsingArrayListFindUniqueElements {
    public static void UsingArrayListFindUniqueElementsMethods(int arr[]) {

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

            if (count == 1) {
                System.out.println("Using Array List " + list.get(i));
            }
        }
    }
}

class UsingCollectionsFrequencyFindUniqueElements {
    public static void UsingCollectionsFrequencyFindUniqueElementsMethods(int arr[]) {

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
            if (count == 1) {
                System.out.println("Using Collections Frequency " + list.get(i));
            }
        }
    }
}

public class FindUniqueElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindUniqueElements
                .UsingNestedForLoopFindUniqueElementsMethods(new int[] { 10, 20, 10, 30, 20, 40 });
        UsingArrayListFindUniqueElements
                .UsingArrayListFindUniqueElementsMethods(new int[] { 10, 20, 10, 30, 20, 40, 60 });
        UsingCollectionsFrequencyFindUniqueElements
                .UsingCollectionsFrequencyFindUniqueElementsMethods(new int[] { 10, 20, 10, 30, 20, 40, 50 });
    }
}
