package Arrays;

import java.util.Arrays;

// Input:
// [10, 25, 5, 40, 15]

// Output:
// 5

class UsingVariablesFindSmallestElement {
    public static void UsingVariablesFindSmallestElementMethods(int arr[]) {

        int firstSmallestnumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstSmallestnumber) {
                firstSmallestnumber = arr[i];
            }
        }
        System.out.println(firstSmallestnumber);
    }
}

class UsingForLoopFindSmallestElement {
    public static void UsingForLoopFindSmallestElementMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[0]);
    }
}

class UsingArraysSortFindSmallestElement {
    public static void UsingArraysSortFindSmallestElementMethods(int arr[]) {

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}

class UsingMathMinFindSmallestElement {
    public static void UsingMathMinFindSmallestElementMethods(int arr[]) {

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
        }
        System.out.println(smallest);
    }
}

public class FindSmallestElement {
    public static void main(String[] args) {
        UsingVariablesFindSmallestElement.UsingVariablesFindSmallestElementMethods(new int[] { 10, 25, 40, 15, -2 });
        UsingForLoopFindSmallestElement.UsingForLoopFindSmallestElementMethods(new int[] { 10, 25, 40, 15 });
        UsingArraysSortFindSmallestElement
                .UsingArraysSortFindSmallestElementMethods(new int[] { 10, 25, 40, 15, 5, 4, 2 });
        UsingMathMinFindSmallestElement.UsingMathMinFindSmallestElementMethods(new int[] { 10, 25, 40, 15, 5, 4 });
    }
}
