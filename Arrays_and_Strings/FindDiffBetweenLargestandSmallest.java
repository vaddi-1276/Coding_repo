package Arrays_and_Strings;

// Input:

// 15, 40, 10, 70, 25

// Output:

// Largest: 70
// Smallest: 10
// Difference: 60

public class FindDiffBetweenLargestandSmallest {
    public static void main(String[] args) {
        int arr[] = { 15, 40, 10, 70, 25 };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest : " + largest);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest : " + smallest);

        int diff = Math.abs(smallest - largest);
        System.out.println(diff);
    }
}
