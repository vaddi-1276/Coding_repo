package Arrays;

// Input: [10, 20, 30, 40, 50]
// Output: 40, 50

class UsingNestedForLoopFindElementsGreaterThanAverage {
    public static void UsingNestedForLoopFindElementsGreaterThanAverageMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;

        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                first = false;
            }
        }
        System.out.println();
    }
}

class UsingRecursionFindElementsGreaterThanAverage {

    public static void UsingRecursionFindElementsGreaterThanAverageMethods(int arr[], int index, int sum) {

        if (index == arr.length) {

            int average = sum / arr.length;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > average) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        sum = sum + arr[index];
        UsingRecursionFindElementsGreaterThanAverageMethods(arr, index + 1, sum);
    }
}

public class FindElementsGreaterThanAverage {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementsGreaterThanAverage
                .UsingNestedForLoopFindElementsGreaterThanAverageMethods(new int[] { 10, 20, 30, 40, 50 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        int arr[] = { 10, 20, 30, 40, 50 };
        
        UsingRecursionFindElementsGreaterThanAverage.UsingRecursionFindElementsGreaterThanAverageMethods(arr, 0, 0);        
        System.out.print(
        "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
