package Arrays;

// Input:
// [10, 20, 30, 40, 50]

// Output:
// 150

class UsingForLoopFindSumOfAllElements {
    public static void UsingForLoopFindSumOfAllElementsMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

class UsingRecursionFindSumOfAllElements {
    public static int UsingRecursionFindSumOfAllElementsMethods(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + UsingRecursionFindSumOfAllElementsMethods(arr, index + 1);
    }
}

public class FindSumOfAllElements {
    public static void main(String[] args) {
        UsingForLoopFindSumOfAllElements.UsingForLoopFindSumOfAllElementsMethods(new int[] { 10, 20, 30, 40, 50 });
        System.out.println(UsingRecursionFindSumOfAllElements
                .UsingRecursionFindSumOfAllElementsMethods(new int[] { 10, 20, 30, 40 }, 0));

    }
}
