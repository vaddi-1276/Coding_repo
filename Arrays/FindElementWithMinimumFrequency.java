package Arrays;

// Input: [10, 20, 10, 30, 20, 10]
// Output: 30

class UsingNestedForLoopFindElementWithMinimumFrequency {
    public static void UsingNestedForLoopFindElementWithMinimumFrequencyMethods(int arr[]) {

        int firstMin = Integer.MAX_VALUE;
        int element = 0;

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

            if (count < firstMin) {
                firstMin = count;
                element = arr[i];
            }
        }

        System.out.println(element);
    }
}

public class FindElementWithMinimumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithMinimumFrequency
                .UsingNestedForLoopFindElementWithMinimumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });
    }
}
