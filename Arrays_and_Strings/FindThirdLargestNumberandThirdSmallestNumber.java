package Arrays_and_Strings;

// Input:

// 10, 50, 30, 80, 60, 20

public class FindThirdLargestNumberandThirdSmallestNumber {

    public static void main(String[] args) {

        int arr[] = { 10, 50, 30, 80, 60, 20 };

        int firstlargest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int Thirdlargest = Integer.MIN_VALUE;

        int firstsmallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int thirdsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > firstlargest) {
                Thirdlargest = secondlargest;
                secondlargest = firstlargest;
                firstlargest = arr[i];
            }

            else if (arr[i] > secondlargest && firstlargest != arr[i]) {
                Thirdlargest = secondlargest;
                secondlargest = arr[i];
            }

            else if (arr[i] > Thirdlargest && secondlargest != arr[i]) {
                Thirdlargest = arr[i];
            }
        }

        System.out.println("Third Largest Number : " + Thirdlargest);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallest) {
                thirdsmallest = secondsmallest;
                secondsmallest = firstsmallest;
                firstsmallest = arr[i];
            }

            else if (arr[i] < secondsmallest && firstsmallest != arr[i]) {
                thirdsmallest = secondsmallest;
                secondsmallest = arr[i];
            } else if (arr[i] < thirdsmallest && secondsmallest != arr[i]) {
                thirdsmallest = arr[i];
            }
        }
        System.out.println("Third Smallest Number : " + thirdsmallest);
    }
}
