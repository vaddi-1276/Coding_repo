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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

class UsingRecursionFindElementsGreaterThanAverage {
    public static int sumofelements(int arr[], int index, int sum) {

        if (index == arr.length) {
            return sum;
        }

        sum = sum + arr[index];

        return sumofelements(arr, index + 1, sum);
    }

    public static void averageofelementsgreaterthanaverage(int arr[], int index, int average) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] > average) {
            System.out.println(arr[index] + " ");
        }
        averageofelementsgreaterthanaverage(arr, index + 1, average);
    }
}

public class FindElementsGreaterThanAverage {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementsGreaterThanAverage
                .UsingNestedForLoopFindElementsGreaterThanAverageMethods(new int[] { 10, 20, 30, 40, 50 });
        int arr[] = { 10, 20, 30, 40, 50 };

        int sum = UsingRecursionFindElementsGreaterThanAverage
                .sumofelements(arr, 0, 0);

        int average = sum / arr.length;

        UsingRecursionFindElementsGreaterThanAverage.averageofelementsgreaterthanaverage(arr, 0,
                average);
    }
}
