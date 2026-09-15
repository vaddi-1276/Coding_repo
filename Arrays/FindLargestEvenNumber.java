package Arrays;

// Input: [15, 22, 8, 31, 44, 19]
// Output: 44

class UsingNestedForLoopFindLargestEvenNumber {
    public static void UsingNestedForLoopFindLargestEvenNumberMethods(int arr[]) {

        int number = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > number) {
                number = arr[i];
            }
        }
        System.out.println(number);
    }
}

class UsingRecursionFindLargestEvenNumber {
    public static void UsingRecursionFindLargestEvenNumberMethods(int arr[], int index, int largest) {

        if (index == arr.length) {
            System.out.println(largest);
            return;
        }

        if (arr[index] % 2 == 0 && arr[index] > largest) {
            largest = arr[index];
        }
        UsingRecursionFindLargestEvenNumberMethods(arr, index + 1, largest);
    }
}

public class FindLargestEvenNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindLargestEvenNumber
                .UsingNestedForLoopFindLargestEvenNumberMethods(new int[] { 15, 22, 8, 31, 44, 19 });
        UsingRecursionFindLargestEvenNumber
                .UsingRecursionFindLargestEvenNumberMethods(new int[] { 15, 22, 8, 31, 19 }, 0, Integer.MIN_VALUE);
    }
}
