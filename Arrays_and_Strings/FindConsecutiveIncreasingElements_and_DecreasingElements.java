package Arrays_and_Strings;

// Input:

// 10, 12, 15, 8, 20, 25, 30

// Output:

// 12 15
// 20 25 30

public class FindConsecutiveIncreasingElements_and_DecreasingElements {
    public static void main(String[] args) {

        int arr[] = { 10, 12, 15, 8, 20, 25, 30 };

        System.out.print("Consecutive Increasing Elements : ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }

            else {
                System.out.println();
            }
        }
        System.out.println();

        // Input:

        // 50, 40, 30, 35, 20, 15, 10

        // Output:

        // 50 40 30
        // 20 15 10

        int arr1[] = { 50, 40, 30, 35, 20, 15, 10 };

        System.out.print("Consecutive Decreasing Elements : ");
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
            } else {
                System.out.println();
            }
        }
        System.out.println();
    }
}
