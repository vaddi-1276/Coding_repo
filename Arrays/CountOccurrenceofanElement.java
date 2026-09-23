package Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Input:
// [10, 20, 10, 30, 10, 40]
// Element = 10

// Output:
// 3

class UsingForLoopCountOccurrenceofanElement {
    public static void UsingForLoopCountOccurrenceofanElementMethods(int arr[], int searchvalue) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchvalue) {
                count++;
            }
        }
        System.out.println("Count using Nested For Loop = " + count);
    }
}

class UsingArrayListCountOccurrenceofanElement {
    public static void UsingArrayListCountOccurrenceofanElementMethods(int arr[], int searchvalue) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchvalue) {
                count++;
            }
        }
        System.out.println("Count using ArrayList = " + count);
    }
}

class UsingCollectionsFrequencyCountOccurrenceofanElement {
    public static void UsingCollectionsFrequencyCountOccurrenceofanElementMethods(int arr[], int searchvalue) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int count = Collections.frequency(list, searchvalue);
        System.out.println("Count using Collections Frequency = " + count);
    }
}

class UsingRecursionCountOccurrenceofanElement {
    public static void UsingRecursionCountOccurrenceofanElementMethods(int arr[], int searchvalue, int index,
            int count) {

        if (index == arr.length) {
            System.out.println("Count using Recursion = " + count);
            return;
        }

        if (arr[index] == searchvalue) {
            count++;
        }
        UsingRecursionCountOccurrenceofanElementMethods(arr, searchvalue, index + 1, count);
    }
}

public class CountOccurrenceofanElement {
    public static void main(String[] args) {
        UsingForLoopCountOccurrenceofanElement
                .UsingForLoopCountOccurrenceofanElementMethods(new int[] { 10, 20, 30, 40 },
                        30);
        UsingArrayListCountOccurrenceofanElement
                .UsingArrayListCountOccurrenceofanElementMethods(new int[] { 10, 20, 30, 30, 40 }, 30);
        UsingCollectionsFrequencyCountOccurrenceofanElement.UsingCollectionsFrequencyCountOccurrenceofanElementMethods(
                new int[] { 10, 20, 30, 30, 30, 40 }, 30);
        UsingRecursionCountOccurrenceofanElement.UsingRecursionCountOccurrenceofanElementMethods(
                new int[] { 10, 20, 30, 30, 30, 30, 40 }, 30, 0, 0);
    }
}
