package Arrays;

// Input:

// [-15, -3, -20, -8, -10]

// Output:

// -20

class UsingNestedForLoopFindsmallestNegativeNumber {
    public static void UsingNestedForLoopFindsmallestNegativeNumberMethods(int arr[]) {

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}

class UsingRecursionFindsmallestNegativeNumber {
    public static void UsingRecursionFindsmallestNegativeNumberMethods(int arr[], int index, int smallest) {

        if (index == arr.length) {
            System.out.println(smallest);
            return;
        }

        if (arr[index] < 0 && arr[index] < smallest) {
            smallest = arr[index];
        }
        UsingRecursionFindsmallestNegativeNumberMethods(arr, index + 1, smallest);
    }
}

class FindsmallestNegativeNumber {

    public static void main(String[] args) {
        UsingNestedForLoopFindsmallestNegativeNumber
                .UsingNestedForLoopFindsmallestNegativeNumberMethods(new int[] { -15, -3, -20, -8, -10 });
        UsingRecursionFindsmallestNegativeNumber.UsingRecursionFindsmallestNegativeNumberMethods(
                new int[] { -15, -3, -8, -10 }, 0, Integer.MAX_VALUE);
    }
}