package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 30, 20, 10, 40]

// Output:
// 40

class UsingNestedForLoopFindLastNonRepeatedElement {
    public static void UsingNestedForLoopFindLastNonRepeatedElementMethods(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
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
                System.out.println(arr[i]);
                return;
            }
        }
    }
}

class UsingArrayListFindLastNonRepeatedElement {
    public static void UsingArrayListFindLastNonRepeatedElementMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
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
                System.out.println(arr[i]);
                return;
            }
        }
    }
}

class UsingCollectionsFrequencyFindLastNonRepeatedElement {
    public static void UsingCollectionsFrequencyFindLastNonRepeatedElementMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
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
                System.out.println(list.get(i));
                return;
            }
        }
    }
}

public class FindLastNonRepeatedElement {
    public static void main(String[] args) {
        UsingNestedForLoopFindLastNonRepeatedElement
                .UsingNestedForLoopFindLastNonRepeatedElementMethods(new int[] { 10, 20, 30, 20, 10, 40 });
        UsingArrayListFindLastNonRepeatedElement
                .UsingArrayListFindLastNonRepeatedElementMethods(new int[] { 10, 20, 30, 20, 10, 60, 70, 60 });
        UsingCollectionsFrequencyFindLastNonRepeatedElement.UsingCollectionsFrequencyFindLastNonRepeatedElementMethods(
                new int[] { 10, 20, 30, 20, 10, 60, 60, 70, 80 });
    }
}
