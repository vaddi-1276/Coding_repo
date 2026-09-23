package Arrays;

// Input: [10, 20, 10, 30, 20, 10]
// Output: 30

class UsingNestedForLoopFindElementWithMinimumFrequency {
    public static void UsingNestedForLoopFindElementWithMinimumFrequencyMethods(int arr[]) {
        int firstmincount = Integer.MAX_VALUE;
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

            int count = 0;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (count < firstmincount) {
                firstmincount = count;
                element = arr[i];
            }
        }
        System.out.println(element);
    }
}

class UsingRecursionFindElementWithMinimumFrequency {
    public static void UsingRecursionFindElementWithMinimumFrequencyMethods(int arr[], int index, int firstminimum,
            int element) {

        if (index == arr.length) {
            System.out.println("Element = " + element);
            System.out.println("Count = " + firstminimum);
            return;
        }
        boolean found = false;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                found = true;
                break;
            }
        }
        if (found == false) {
            int count = 1;
            for (int k = index + 1; k < arr.length; k++) {
                if (arr[k] == arr[index]) {
                    count++;
                }
            }
            if (count < firstminimum) {
                firstminimum = count;
                element = arr[index];
            }
        }
        UsingRecursionFindElementWithMinimumFrequencyMethods(arr, index + 1, firstminimum, element);
    }
}

class UsingForLoopFindElementWithMinimumFrequency {
    public static void UsingForLoopFindElementWithMinimumFrequencyMethods(int arr[]) {

        int firstMin = Integer.MAX_VALUE;
        int element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count < firstMin) {
                firstMin = count;
                element = arr[i];
            }
        }
        System.out.println("Element = " + element);
        System.out.println("Count = " + firstMin);
    }
}

public class FindElementWithMinimumFrequency {
    public static void main(String[] args) {
        UsingNestedForLoopFindElementWithMinimumFrequency
                .UsingNestedForLoopFindElementWithMinimumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

         int arr[] = { 10, 20, 10, 30, 20, 10 };
        UsingRecursionFindElementWithMinimumFrequency.UsingRecursionFindElementWithMinimumFrequencyMethods(arr, 0,
                Integer.MAX_VALUE, arr[0]);

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingForLoopFindElementWithMinimumFrequency.UsingForLoopFindElementWithMinimumFrequencyMethods(arr);
    }
}
