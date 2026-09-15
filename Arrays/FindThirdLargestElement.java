package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input: [10, 40, 20, 50, 30]
// Output: 30

class UsingArraySortFindThirdLargestElement {
    public static void UsingArraySortFindThirdLargestElementMethods(int arr[]) {

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 3]);
    }
}

class UsingVariablesFindThirdLargestElement {
    public static void UsingVariablesFindThirdLargestElementMethods(int arr[]) {

        int firstLargestnumber = Integer.MIN_VALUE;
        int secondLargestnumber = Integer.MIN_VALUE;
        int thirdLargestnumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargestnumber) {
                thirdLargestnumber = secondLargestnumber;

                secondLargestnumber = firstLargestnumber;

                firstLargestnumber = arr[i];
            }

            else if (arr[i] > secondLargestnumber) {
                thirdLargestnumber = secondLargestnumber;
                secondLargestnumber = arr[i];
            }

            else if (arr[i] > thirdLargestnumber) {
                thirdLargestnumber = arr[i];
            }
        }
        System.out.println(thirdLargestnumber);
    }
}

class UsingNestedForLoopFindThirdLargestElement {
    public static void UsingNestedForLoopFindThirdLargestElementMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 3]);
    }
}

class UsingRecursionFindThirdLargestElement {
    public static void UsingRecursionFindThirdLargestElementMethods(int arr[], int index, int firstLargestnumber,
            int secondLargestnumber, int thirdLargestnumber) {

        if (index == arr.length) {
            System.out.println(thirdLargestnumber);
            return;
        }
        if (arr[index] > firstLargestnumber) {
            thirdLargestnumber = secondLargestnumber;
            secondLargestnumber = firstLargestnumber;
            firstLargestnumber = arr[index];
        }

        else if (arr[index] > secondLargestnumber) {
            thirdLargestnumber = secondLargestnumber;
            secondLargestnumber = arr[index];
        }

        else if (arr[index] > thirdLargestnumber) {
            thirdLargestnumber = arr[index];
        }
        UsingRecursionFindThirdLargestElementMethods(arr, index + 1, firstLargestnumber, secondLargestnumber,
                thirdLargestnumber);
    }
}

class UsingArrayListCollectionsSortFindThirdLargestElement {
    public static void UsingArrayListCollectionsSortFindThirdLargestElementMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Collections.sort(list);
        System.out.println(list.get(list.size() - 3));
    }
}

public class FindThirdLargestElement {
    public static void main(String[] args) {
        UsingArraySortFindThirdLargestElement
                .UsingArraySortFindThirdLargestElementMethods(new int[] { 10, 40, 20, 50, 30 });
        UsingVariablesFindThirdLargestElement
                .UsingVariablesFindThirdLargestElementMethods(new int[] { 10, 40, 20, 60, 50, 30 });
        UsingNestedForLoopFindThirdLargestElement
                .UsingNestedForLoopFindThirdLargestElementMethods(new int[] { 10, 40, 20, 60, 50, 30, 70 });
        UsingRecursionFindThirdLargestElement
                .UsingRecursionFindThirdLargestElementMethods(new int[] { 10, 40, 20, 60, 50, 30, 70, 80 }, 0,
                        Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        UsingArrayListCollectionsSortFindThirdLargestElement
                .UsingArrayListCollectionsSortFindThirdLargestElementMethods(
                        new int[] { 10, 40, 20, 60, 90, 50, 30, 70, 80 });
    }
}
