package Arrays;

// Input: [5, 10, 5, 20, 10, 30, 10]
// Output: 5, 10

class UsingNestedForLoopFindElementsAppearingMoreThanOnce {
    public static void UsingNestedForLoopFindElementsAppearingMoreThanOnceMethods(int arr[]) {

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
                System.out.println(arr[i]);
            }
        }
    }
}

public class FindElementsAppearingMoreThanOnce {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementsAppearingMoreThanOnce
                .UsingNestedForLoopFindElementsAppearingMoreThanOnceMethods(new int[] { 5, 10, 5, 20, 10, 30, 10 });
    }
}
