package Arrays_and_Strings;

// Input:

// 10, 20, 30, 40, 50, 60

// Output:

// Elements: 10 30 50
// Sum: 90

public class FindSumofElementsatEvenIndex {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        System.out.print("Elements : ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
                sum = sum + arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum : " + sum);
    }
}
