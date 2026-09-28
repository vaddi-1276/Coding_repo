package Arrays_and_Strings;

// Input:

// 10, 20, 10, 30, 20, 10

// Output:

// 10 = 3
// 20 = 2
// 30 = 1

public class FindFrequencyofEachElement {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 10, 30, 20, 10 };
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
            System.out.println(arr[i] + " = " + count);
        }
    }
}
