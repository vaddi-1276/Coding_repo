package Arrays;

import java.util.Arrays;

// Input:
// [10, 25, 5, 40, 15]

// Output:
// 25

class UsingVariablesFindSecondLargestElement {
    public static void UsingVariablesFindSecondLargestElementMethods(int arr[]) {

        int firstLargestNumber = arr[0];
        int secondLargestNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargestNumber) {

                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = arr[i];
            }

            else if (arr[i] > secondLargestNumber && firstLargestNumber != arr[i]) {
                secondLargestNumber = arr[i];
            }
        }

        System.out.println(firstLargestNumber);
        System.out.println(secondLargestNumber);
    }
}

class UsingArraysSortFindSecondLargestElement {
    public static void UsingArraysSortFindSecondLargestElementMethods(int arr[]) {

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
    }
}

class UsingForLoopFindSecondLargestElement {
    public static void UsingForLoopFindSecondLargestElementMethods(int arr[]) {

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
        System.out.println(arr[arr.length - 2]);
    }
}

class UsingMathMaxFindSecondLargestElement {
    public static void UsingMathMaxFindSecondLargestElementMethods(int arr[]) {

        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = arr[i];
            } else {
                secondLargestNumber = Math.max(secondLargestNumber, arr[i]);
            }
        }
        System.out.println(firstLargestNumber);
        System.out.println(secondLargestNumber);
    }
}

public class FindSecondLargestElement {
    public static void main(String[] args) {
        UsingVariablesFindSecondLargestElement
                .UsingVariablesFindSecondLargestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingArraysSortFindSecondLargestElement
                .UsingArraysSortFindSecondLargestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingForLoopFindSecondLargestElement
                .UsingForLoopFindSecondLargestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingMathMaxFindSecondLargestElement
                .UsingMathMaxFindSecondLargestElementMethods(new int[] { 10, 25, 5, 40, 15 });
    }
}
