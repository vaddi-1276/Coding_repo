package Algorthims;

// [1,4,6,8,10], Target=7

// 6

public class ClosestElement {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 6, 8, 10 };
        int target = 7;
        int value = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= target) {
                value = arr[i];
            } else {
                break;
            }
        }
        System.out.println(value);
    }
}
