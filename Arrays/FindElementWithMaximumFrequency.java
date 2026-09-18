package Arrays;

// Input: [10, 20, 10, 30, 20, 10]
// Output: 10

class UsingNestedForLoopFindElementWithMaximumFrequency {
    public static void UsingNestedForLoopFindElementWithMaximumFrequencyMethods(int arr[]) {

        int max = 0;
        int element = arr[0];
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

            if (count > max) {
                max = count;
                element = arr[i];
            }
        }
        System.out.println(element);
    }
}

public class FindElementWithMaximumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithMaximumFrequency
                .UsingNestedForLoopFindElementWithMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });
    }
}
