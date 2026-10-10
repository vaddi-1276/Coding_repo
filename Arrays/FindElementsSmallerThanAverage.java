package Arrays;

// Input: [10, 20, 30, 40, 50]

// Output: 10, 20

class UsingNestedForLoopFindElementsSmallerThanAverage {
    public static void UsingNestedForLoopFindElementsSmallerThanAverageMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int average = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

class UsingRecursionFindElementsSmallerThanAverage {

    public static void UsingRecursionFindElementsSmallerThanAverageMethods(int arr[], int index, int sum) {

        if (index == arr.length) {

            int average = sum / arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < average) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        sum = sum + arr[index];
        UsingRecursionFindElementsSmallerThanAverageMethods(arr, index + 1, sum);
    }
}

public class FindElementsSmallerThanAverage {
    public static void main(String[] args) {

        UsingNestedForLoopFindElementsSmallerThanAverage
                .UsingNestedForLoopFindElementsSmallerThanAverageMethods(new int[] { 10, 20, 30, 40, 50 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindElementsSmallerThanAverage
                .UsingRecursionFindElementsSmallerThanAverageMethods(new int[] { 10, 20, 30, 40, 50 }, 0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
