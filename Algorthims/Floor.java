package Algorthims;

// Input:
// Array = [1, 2, 4, 6, 10]
// Target = 5

// Output:
// 4

// What is Floor?
// The floor is the largest number in the array that is less than or equal to the target.

public class Floor {
    public static int FloorMethods(int arr[], int target) {

        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                value = arr[i];
            } else {
                break;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        FloorMethods(new int[]{1, 2, 4, 6, 10}, 5);
    }
}
