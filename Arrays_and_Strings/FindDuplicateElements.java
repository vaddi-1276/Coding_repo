package Arrays_and_Strings;

// Input:

// 10, 20, 10, 30, 40, 20, 50

// Output:

// Duplicate Elements: 10 20

public class FindDuplicateElements {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 10, 30, 40, 20, 50 };
        System.out.print("Duplicate Elements: ");
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
            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
