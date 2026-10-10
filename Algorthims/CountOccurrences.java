package Algorthims;

// [1,2,2,2,3,4], Target=2

// Count of 2 is 3

public class CountOccurrences {
    public static int CountOccurrencesMethods(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            int count = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (arr[i] == target) {
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CountOccurrencesMethods(new int[] { 1, 2, 2, 2, 3, 4 }, 2);
    }
}
