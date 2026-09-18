package Arrays;

// Input: [10, 20, 10, 30, 20, 40, 50]
// Output: 10, 20

class UsingNestedForLoopFindAllElementsAppearingExactlyTwice {
    public static void UsingNestedForLoopFindAllElementsAppearingExactlyTwiceMethods(int arr[]) {

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

            if (count == 2) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class FindAllElementsAppearingExactlyTwice {
    public static void main(String[] args) {
        UsingNestedForLoopFindAllElementsAppearingExactlyTwice
                .UsingNestedForLoopFindAllElementsAppearingExactlyTwiceMethods(
                        new int[] { 10, 20, 10, 30, 20, 40, 50 });
    }
}
