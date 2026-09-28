package Arrays_and_Strings;

// Input:

// 10, 50, 30, 80, 60, 20

// Output:

// Second Largest: 60

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = { 10, 50, 30, 80, 60, 20 };
        int firstlargestnumber = Integer.MIN_VALUE;
        int secondlargestnumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstlargestnumber) {
                secondlargestnumber = firstlargestnumber;
                firstlargestnumber = arr[i];
            }

            else if (arr[i] > secondlargestnumber && firstlargestnumber != arr[i]) {
                secondlargestnumber = arr[i];
            }
        }
        System.out.println("Second Largest Number : " + secondlargestnumber);
    }
}
