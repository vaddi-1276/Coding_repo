package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 10, 30, 20, 10]

// Output:
// 10 = 3
// 20 = 2
// 30 = 1

class UsingForLoopFindFrequencyofEveryElement {
    public static void UsingForLoopFindFrequencyofEveryElementMethods(int arr[]) {
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

            System.out.println(arr[i] + " = " + count);
        }
    }
}

class UsingArrayListFindFrequencyofEveryElement {
    public static void UsingArrayListFindFrequencyofEveryElementMethods(int arr[]) {

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
            System.out.println(list.get(i) + " = " + count);
        }
    }
}

class UsingCollectionsFrequencyFindFrequencyofEveryElement {
    public static void UsingCollectionsFrequencyFindFrequencyofEveryElementMethods(int arr[]) {

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

            System.out.println(list.get(i) + " = " + count);
        }
    }
}

public class FindFrequencyofEveryElement {
    public static void main(String[] args) {
        UsingForLoopFindFrequencyofEveryElement
                .UsingForLoopFindFrequencyofEveryElementMethods(new int[] { 10, 20, 10, 30, 20, 10 });
        UsingArrayListFindFrequencyofEveryElement
                .UsingArrayListFindFrequencyofEveryElementMethods(new int[] { 10, 20, 10, 30, 20, 10 });
        UsingCollectionsFrequencyFindFrequencyofEveryElement
                .UsingCollectionsFrequencyFindFrequencyofEveryElementMethods(new int[] { 10, 40, 20, 10, 30, 20, 10 });
    }
}
