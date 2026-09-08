package Arrays;

// Input:
// [10, 20, 30, 40, 50]

// Output:
// 30

class UsingForLoopFindAverageOfElements {
    public static void UsingForLoopFindAverageOfElementsMethods(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;

        System.out.println(average);
    }
}

class UsingSumOfArrayValuesFindAverageOfElements {
    public static int UsingSumOfArrayValuesFindAverageOfElementsMethods(int arr[], int index) {

        if (index == arr.length) {
            return 0;
        }

        return arr[index] + UsingSumOfArrayValuesFindAverageOfElementsMethods(arr, index + 1);
    }
}

class UsingRecursionFindAverageOfElements {
    public static void UsingRecursionFindAverageOfElementsMethods(int arr[]) {
        int average = UsingSumOfArrayValuesFindAverageOfElements.UsingSumOfArrayValuesFindAverageOfElementsMethods(arr,
                0) / arr.length;

        System.out.println(average);

    }
}

public class FindAverageOfElements {
    public static void main(String[] args) {
        UsingForLoopFindAverageOfElements.UsingForLoopFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50 });
        UsingSumOfArrayValuesFindAverageOfElements
                .UsingSumOfArrayValuesFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40 }, 0);
        UsingRecursionFindAverageOfElements
                .UsingRecursionFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40 });
    }
}
