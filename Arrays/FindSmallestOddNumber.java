package Arrays;

// Input: [15, 22, 8, 31, 44, 19]
// Output: 15

class UsingNestedForLoopFindSmallestOddNumber {
    public static void UsingNestedForLoopFindSmallestOddNumberMethods(int arr[]) {

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}

class UsingRecursionFindSmallestOddNumber {
    public static void UsingRecursionFindSmallestOddNumberMethods(int arr[], int index, int smallest) {

        if (index == arr.length) {
            System.out.println(smallest);
            return;
        }

        if (arr[index] % 2 != 0 && arr[index] < smallest) {
            smallest = arr[index];
        }

        UsingRecursionFindSmallestOddNumberMethods(arr, index + 1, smallest);
    }
}

public class FindSmallestOddNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindSmallestOddNumber
                .UsingNestedForLoopFindSmallestOddNumberMethods(new int[] { 15, 22, 8, 31, 44, 19 });
        UsingRecursionFindSmallestOddNumber
                .UsingRecursionFindSmallestOddNumberMethods(new int[] { 22, 8, 31, 44, 19 }, 0, Integer.MAX_VALUE);

    }
}
