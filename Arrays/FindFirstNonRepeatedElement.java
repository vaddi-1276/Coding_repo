package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 30, 20, 10, 40]

// Output:
// 30

class UsingNestedForLoopFindFirstNonRepeatedElement {
    public static void UsingNestedForLoopFindFirstNonRepeatedElementMethods(int arr[]) {
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
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

class UsingArrayListFindFirstNonRepeatedElement {
    public static void UsingArrayListFindFirstNonRepeatedElementMethods(int arr[]) {
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
                System.out.println(list.get(i));
                return;
            }
        }
    }
}

class UsingCollectionsFrequencyFindFirstNonRepeatedElement {
    public static void UsingCollectionsFrequencyFindFirstNonRepeatedElementMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
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

            int count = Collections.frequency(list, list.get(i));

            if (count == 1) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

class UsingRecursionFindFirstNonRepeatedElement {
    public static void UsingRecursionFindFirstNonRepeatedElementMethods(int arr[], int index) {
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
            UsingRecursionFindFirstNonRepeatedElementMethods(arr, index + 1);
            return;
        }

        int count = 1;
        for (int k = index + 1; k < arr.length; k++) {
            if (arr[k] == arr[index]) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(arr[index]);
            return;
        }
        UsingRecursionFindFirstNonRepeatedElementMethods(arr, index + 1);
    }
}

public class FindFirstNonRepeatedElement {
    public static void main(String[] args) {
        UsingNestedForLoopFindFirstNonRepeatedElement
                .UsingNestedForLoopFindFirstNonRepeatedElementMethods(new int[] { 10, 20, 30, 20, 10, 40 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingArrayListFindFirstNonRepeatedElement
        // .UsingArrayListFindFirstNonRepeatedElementMethods(new int[] { 10, 20, 30, 20,
        // 10, 40 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        UsingCollectionsFrequencyFindFirstNonRepeatedElement
                .UsingCollectionsFrequencyFindFirstNonRepeatedElementMethods(new int[] { 10, 20, 20, 10, 40 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
        
        UsingRecursionFindFirstNonRepeatedElement.UsingRecursionFindFirstNonRepeatedElementMethods(new int[] { 10, 20, 20, 10, 50 }, 0);
    }
}
