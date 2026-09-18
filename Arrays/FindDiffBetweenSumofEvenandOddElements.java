package Arrays;

// Input: [1, 2, 3, 4, 5, 6]
// Output: 3

class UsingNestedForLoopFindDiffBetweenSumofEvenandOddElements {
    public static void UsingNestedForLoopFindDiffBetweenSumofEvenandOddElementsMethods(int arr[]) {

        int evenvalue = 0;
        int oddvalue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenvalue = evenvalue + arr[i];
            } else {
                oddvalue = oddvalue + arr[i];
            }
        }
        System.out.println(Math.abs(evenvalue - oddvalue));
    }
}

class UsingRecursionFindDiffBetweenSumofEvenandOddElements {
    public static void UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(int arr[], int index, int evenvalue,
            int oddvalue) {

        if (index == arr.length) {
            System.out.println(Math.abs(oddvalue-evenvalue));
            return;
        }

        if (arr[index] % 2 == 0) {
            evenvalue = evenvalue + arr[index];
        } else {
            oddvalue = oddvalue + arr[index];
        }

        UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(arr, index + 1, evenvalue, oddvalue);
    }
}

public class FindDiffBetweenSumofEvenandOddElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindDiffBetweenSumofEvenandOddElements
                .UsingNestedForLoopFindDiffBetweenSumofEvenandOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });

        UsingRecursionFindDiffBetweenSumofEvenandOddElements
                .UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 }, 0, 0, 0);
    }
}
