package Arrays;

// Input: [10, 20, 30, 40, 50]
// Output: Sorted

class UsingNestedForLoopCheckArrayIsSorted {
    public static void UsingNestedForLoopCheckArrayIsSortedMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("Not Sorted");
                    return;
                }
            }
        }
        System.out.println("Sorted");
    }
}

class UsingRecursionCheckArrayIsSorted {

    public static void UsingRecursionCheckArrayIsSortedMethods(int arr[], int index) {

        if (index == arr.length) {
            System.out.println("Sorted");
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                System.out.println("Not Sorted");
                return;
            }
        }
        UsingRecursionCheckArrayIsSortedMethods(arr, index + 1);
    }
}

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        UsingNestedForLoopCheckArrayIsSorted
        .UsingNestedForLoopCheckArrayIsSortedMethods(new int[] { 10, 30, 20, 40, 50
        });
        UsingRecursionCheckArrayIsSorted.UsingRecursionCheckArrayIsSortedMethods(new int[] { 10, 20,30, 40, 50 }, 0);
    }
}
