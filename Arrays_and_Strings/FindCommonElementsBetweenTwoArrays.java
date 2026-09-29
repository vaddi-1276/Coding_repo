package Arrays_and_Strings;

// Input

// Array 1: 10, 20, 30, 40, 50
// Array 2: 30, 50, 60, 70, 80

// Output

// Common: 30 50

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

        int arr1[] = { 10, 20, 30, 40, 50 };
        int arr2[] = { 30, 50, 60, 70, 80 };

        System.out.print("Common : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
