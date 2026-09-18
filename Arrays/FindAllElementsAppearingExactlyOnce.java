package Arrays;

// Input: [10, 20, 10, 30, 20, 40, 50]
// Output: 30, 40, 50

class UsingNestedForLoopFindAllElementsAppearingExactlyOnce {
    public static void UsingNestedForLoopFindAllElementsAppearingExactlyOnceMethods(int arr[]) {

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
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class FindAllElementsAppearingExactlyOnce {
    public static void main(String[] args) {
        UsingNestedForLoopFindAllElementsAppearingExactlyOnce
                .UsingNestedForLoopFindAllElementsAppearingExactlyOnceMethods(new int[] { 10, 20, 10, 30, 20, 40, 50 });
    }
}
