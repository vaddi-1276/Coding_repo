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

    static int sum = 0;

    public static void sumofelements(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        sum = sum + arr[index];
        sumofelements(arr, index + 1);
    }

    public static void smallerthanaverage(int arr[], int index, int average) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] < average) {
            System.out.print(arr[index]+" ");
        }
        smallerthanaverage(arr, index + 1, average);
    }
}

public class FindElementsSmallerThanAverage {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementsSmallerThanAverage
                .UsingNestedForLoopFindElementsSmallerThanAverageMethods(new int[] { 10, 20, 30, 40, 50 });

        int arr[] = new int[] { 10, 20, 30, 40, 50 };
        UsingRecursionFindElementsSmallerThanAverage.sumofelements(arr, 0);

        int average = UsingRecursionFindElementsSmallerThanAverage.sum / arr.length;
        UsingRecursionFindElementsSmallerThanAverage.smallerthanaverage(arr, 0, average);
        System.out.println();
    }
}
