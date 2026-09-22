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
        System.out.println("Element = " + element);
        System.out.println("Count = " + max);
    }
}

class UsingRecursionFindElementWithMaximumFrequency {
    public static void UsingRecursionFindElementWithMaximumFrequencyMethods(int arr[], int index, int max,
            int element) {

        if (index == arr.length) {
            System.out.println("Element = " + element);
            return;
        }

        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (arr[index] == arr[i]) {
                found = true;
                break;
            }
        }
        if (found == false) {
            int count = 0;
            for (int k = index + 1; k < arr.length; k++) {
                if (arr[k] == arr[index]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                element = arr[index];
            }
        }
        UsingRecursionFindElementWithMaximumFrequencyMethods(arr, index + 1, max, element);
    }
}

public class FindElementWithMaximumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithMaximumFrequency
                .UsingNestedForLoopFindElementWithMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });

        int arr[]=new int[] { 10, 20, 10, 30, 20, 10 };
        UsingRecursionFindElementWithMaximumFrequency.UsingRecursionFindElementWithMaximumFrequencyMethods(arr, 0, 0, arr[0]);
    }
}
