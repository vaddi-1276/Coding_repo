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
            }

            else if (arr[i] % 2 != 0) {
                oddvalue = oddvalue + arr[i];
            }
        }
        int difference = Math.abs(evenvalue - oddvalue);
        System.out.println(difference);
    }
}

class UsingRecursionFindDiffBetweenSumofEvenandOddElements {
    public static void UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(int arr[], int index, int evencount,
            int oddcount) {

        if (index == arr.length) {
            System.out.println(Math.abs(evencount - oddcount));
            return;
        }

        if (arr[index] % 2 == 0) {
            evencount = evencount + arr[index];
        } else if (arr[index] % 2 != 0) {
            oddcount = oddcount + arr[index];
        }
        UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(arr, index + 1, evencount, oddcount);
    }
}

public class FindDiffBetweenSumofEvenandOddElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindDiffBetweenSumofEvenandOddElements
                .UsingNestedForLoopFindDiffBetweenSumofEvenandOddElementsMethods(new int[] { 1, 2, 3, 4, 5, 6 });

        UsingRecursionFindDiffBetweenSumofEvenandOddElements
                .UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(new int[] { 1,
                        2, 3, 4, 5, 6 }, 0, 0, 0);
    }
}
