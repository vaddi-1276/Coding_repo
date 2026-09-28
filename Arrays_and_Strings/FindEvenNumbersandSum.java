package Arrays_and_Strings;

// Input:

// 10, 15, 20, 25, 30, 35

// Output:

// Even Numbers: 10 20 30
// Sum: 60

public class FindEvenNumbersandSum {
    public static void main(String[] args) {

        int arr[] = { 10, 15, 20, 25, 30, 35 };
        int evensum = 0;

        System.out.print("Even Numbers :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evensum = evensum + arr[i];
            }
        }
        System.out.println();
        System.out.println(evensum);
    }
}
