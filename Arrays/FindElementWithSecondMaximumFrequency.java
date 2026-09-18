package Arrays;

// Input:

// [10, 20, 10, 30, 20, 10]

// Output:
// 20

class UsingNestedForLoopFindElementWithSecondMaximumFrequency {
    public static void UsingNestedForLoopFindElementWithSecondMaximumFrequencyMethods(int arr[]) {
        int firstMax = 0;
        int secondMax = 0;
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

            if (count > firstMax) {
                secondMax = firstMax;
                firstMax = count;
            }

            else if (count > secondMax && firstMax != count) {
                secondMax = count;
                element = arr[i];
            }
        }

        System.out.println(element);
    }
}

public class FindElementWithSecondMaximumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithSecondMaximumFrequency
                .UsingNestedForLoopFindElementWithSecondMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });
    }
}
