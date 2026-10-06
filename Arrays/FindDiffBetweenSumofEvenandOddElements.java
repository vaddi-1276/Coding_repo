package Arrays;

// Input: [1, 2, 3, 4, 5, 6]
// Output: 3

class UsingNestedForLoopFindDiffBetweenSumofEvenandOddElements {
    public static void UsingNestedForLoopFindDiffBetweenSumofEvenandOddElementsMethods(int arr[]) {

        int evendigit = 0;
        int odddigit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evendigit = evendigit + arr[i];
            }

            else if (arr[i] % 2 != 0) {
                odddigit = odddigit + arr[i];
            }
        }
        int difference = Math.abs(odddigit - evendigit);
        System.out.println("Difference b/w evensum and oddsum using For Loop = " + difference);
    }
}

class UsingRecursionFindDiffBetweenSumofEvenandOddElements {
    public static void UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(int arr[], int index, int evensum,
            int oddsum) {
        if (index == arr.length) {
            int difference = Math.abs(evensum - oddsum);
            System.out.println("Difference b/w evensum and oddsum using Recursion = " + difference);
            return;
        }
        if (arr[index] % 2 == 0) {
            evensum = evensum + arr[index];
        } else if (arr[index] % 2 != 0) {
            oddsum = oddsum + arr[index];
        }
        UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(arr, index + 1, evensum, oddsum);
    }
}

public class FindDiffBetweenSumofEvenandOddElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindDiffBetweenSumofEvenandOddElements
                .UsingNestedForLoopFindDiffBetweenSumofEvenandOddElementsMethods(new int[] {
                        1, 2, 3, 4, 5, 6 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindDiffBetweenSumofEvenandOddElements
                .UsingRecursionFindDiffBetweenSumofEvenandOddElementsMethods(new int[] { 1,
                        2, 3, 4, 5, 6,7,8 }, 0, 0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
