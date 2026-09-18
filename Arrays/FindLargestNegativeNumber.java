package Arrays;

// Input:

// [-15, -3, -20, -8, -10]

// Output:

// -3

class UsingNestedForLoopFindLargestNegativeNumber {
    public static void UsingNestedForLoopFindLargestNegativeNumberMethods(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > largest) {
                largest = arr[i];

            }
        }
        System.out.println(largest);
    }
}

class UsingRecursionFindLargestNegativeNumber {
    public static void UsingRecursionFindLargestNegativeNumberMethods(int arr[], int index, int largest) {

        if (index == arr.length) {
            System.out.println(largest);
            return;
        }

        if (arr[index] < 0 && arr[index] > largest) {
            largest = arr[index];
        }
        UsingRecursionFindLargestNegativeNumberMethods(arr, index + 1, largest);
    }
}

public class FindLargestNegativeNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindLargestNegativeNumber
                .UsingNestedForLoopFindLargestNegativeNumberMethods(new int[] { -15, -3, -20, -8, -10 });
        UsingRecursionFindLargestNegativeNumber.UsingRecursionFindLargestNegativeNumberMethods(
                new int[] { -15, -20, -8, -10 }, 0, Integer.MIN_VALUE);
    }
}
