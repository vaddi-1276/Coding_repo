package Arrays;

// Input: [10, 20, 10, 30, 20, 10]
// Output: 10

class UsingNestedForLoopFindElementWithMaximumFrequency {
    public static void UsingNestedForLoopFindElementWithMaximumFrequencyMethods(int arr[]) {
        int maxfrequency = Integer.MIN_VALUE;
        int value = 0;
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
            if (count > maxfrequency) {
                maxfrequency = count;
                value = arr[i];
            }
        }
        System.out.println(value);
    }
}

class UsingRecursionFindElementWithMaximumFrequency {
    public static void UsingRecursionFindElementWithMaximumFrequencyMethods(int arr[], int index, int max,
            int element) {
        if (index == arr.length) {
            System.out.println(element);
            return;
        }
        boolean isduplicate = false;
        for (int j = 0; j < index; j++) {
            if (arr[index] == arr[j]) {
                isduplicate = true;
                break;
            }
        }
        if (isduplicate) {
            UsingRecursionFindElementWithMaximumFrequencyMethods(arr, index + 1, max, element);
            return;
        }
        int count = 1;
        for (int k = index + 1; k < arr.length; k++) {
            if (arr[k] == arr[index]) {
                count++;
            }
        }
        if (count > max) {
            max = count;
            element = arr[index];
        }
        UsingRecursionFindElementWithMaximumFrequencyMethods(arr, index + 1, max, element);
    }
}

public class FindElementWithMaximumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithMaximumFrequency
                .UsingNestedForLoopFindElementWithMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindElementWithMaximumFrequency
                .UsingRecursionFindElementWithMaximumFrequencyMethods(new int[] { 10, 20, 20, 20, 10, 30, 20, 10 }, 0,
                        0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
