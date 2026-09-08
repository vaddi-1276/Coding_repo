package Arrays;

import java.util.Arrays;

// Input:
// [10, 25, 5, 40, 15]

// Output:
// 10

class UsingVariablesFindSecondSmallestElement {
    public static void UsingVariablesFindSecondSmallestElementMethods(int arr[]) {

        int firstsmallestnumber = arr[0];
        int secondsmallestnumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallestnumber) {
                secondsmallestnumber = firstsmallestnumber;
                firstsmallestnumber = arr[i];
            }

            else if (arr[i] < secondsmallestnumber && firstsmallestnumber != arr[i]) {
                secondsmallestnumber = arr[i];
            }
        }
        System.out.println(firstsmallestnumber);
        System.out.println(secondsmallestnumber);
    }
}

class UsingForLoopFindSecondSmallestElement {
    public static void UsingForLoopFindSecondSmallestElementMethods(int arr[]) {

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
        System.out.println(arr[1]);
    }
}

class UsingArraysSortFindSecondSmallestElement {
    public static void UsingArraysSortFindSecondSmallestElementMethods(int arr[]) {
        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

class UsingMathMinFindSecondSmallestElement {
    public static void UsingMathMinFindSecondSmallestElementMethods(int arr[]) {
        int firstsmallestnumber = Integer.MAX_VALUE;
        int secondsmallestnumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallestnumber) {
                secondsmallestnumber = firstsmallestnumber;
                firstsmallestnumber = arr[i];
            } else if (firstsmallestnumber != arr[i]) {
                secondsmallestnumber = Math.min(secondsmallestnumber, arr[i]);
            }
        }
        System.out.println(firstsmallestnumber);
        System.out.println(secondsmallestnumber);
    }
}

public class FindSecondSmallestElement {
    public static void main(String[] args) {
        UsingVariablesFindSecondSmallestElement
                .UsingVariablesFindSecondSmallestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingForLoopFindSecondSmallestElement
                .UsingForLoopFindSecondSmallestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingArraysSortFindSecondSmallestElement
                .UsingArraysSortFindSecondSmallestElementMethods(new int[] { 10, 25, 5, 40, 15 });
        UsingMathMinFindSecondSmallestElement
                .UsingMathMinFindSecondSmallestElementMethods(new int[] { 10, 25, 5, 40, 15 });
    }
}
