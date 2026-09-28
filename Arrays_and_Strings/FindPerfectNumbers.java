package Arrays_and_Strings;

// Input:

// 6, 10, 28, 15, 20, 496

// Output:

// Perfect Numbers: 6 28 496

public class FindPerfectNumbers {
    public static void main(String[] args) {

        int arr[] = { 6, 10, 28, 15, 20, 496 };
        System.out.print("Perfect Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 1; j <arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum = sum + j;
                }
            }
            if (arr[i] == sum) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
