package Arrays_and_Strings;

// Input:

// 15, 40, 10, 70, 25

// Output:

// Largest: 70
// Smallest: 10
// Sum: 80

public class FindSumofLargestandSmallest {
    public static void main(String[] args) {

        int arr[] = { 15, 40, 10, 70, 25 };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        int sum = Math.abs(largest + smallest);
        System.out.println(sum);
    }
}
