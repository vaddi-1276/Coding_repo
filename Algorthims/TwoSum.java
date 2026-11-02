package Algorthims;

// [2,7,11,15], Target=9
// 2,7
public class TwoSum {
    public static void TwoSumMethods(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == value) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        TwoSumMethods(new int[] { 0, 2, 7, 8, 11, 15 }, 15);
    }
}
