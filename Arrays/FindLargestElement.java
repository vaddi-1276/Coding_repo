package Arrays;

import java.util.Arrays;
// Input:
// [10, 25, 5, 40, 15]

// Output:
// 40

class UsingVariablesFindLargestElement {
    public static void UsingVariablesFindLargestElementMethods(int arr[]) {

        int firstLargestnumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargestnumber) {
                firstLargestnumber = arr[i];
            }
        }
        System.out.println(firstLargestnumber);
    }
}

class UsingForLoopFindLargestElement {
    public static void UsingForLoopFindLargestElementMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[arr.length - 1]);
    }
}

class UsingArraysSortFindLargestElement {
    public static void UsingArraysSortFindLargestElementMethods(int arr[]) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}

class UsingMathMinFindLargestElement {
    public static void UsingMathMinFindLargestElementMethods(int arr[]) {

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        System.out.println(largest);
    }
}

public class FindLargestElement {
    public static void main(String[] args) {
        UsingVariablesFindLargestElement.UsingVariablesFindLargestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingForLoopFindLargestElement.UsingForLoopFindLargestElementMethods(new int[] { 10, 25, 5, 15 });
        UsingArraysSortFindLargestElement.UsingArraysSortFindLargestElementMethods(new int[] { 10, 25, 5, 15, 50 });
        UsingMathMinFindLargestElement.UsingMathMinFindLargestElementMethods(new int[] { 10, 25, 5 });
    }
}
