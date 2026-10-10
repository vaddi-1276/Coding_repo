package Arrays;

// Input: [10, 20, 10, 30, 20, 10]
// Output: 30

class UsingNestedForLoopFindElementWithMinimumFrequency {
    public static void UsingNestedForLoopFindElementWithMinimumFrequencyMethods(int arr[]) {

        int minimumelement = 0;
        int minimumcountvalue = Integer.MAX_VALUE;

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

            if (count < minimumcountvalue) {
                minimumcountvalue = count;
                minimumelement = arr[i];
            }
        }
        System.out.println(minimumelement);
    }
}

class UsingRecursionFindElementWithMinimumFrequency {

    public static void UsingRecursionFindElementWithMinimumFrequencyMethods(int arr[], int index, int minimumelement,
            int minimumcountvalue) {

        if (index == arr.length) {
            System.out.println(minimumelement);
            return;
        }

        boolean found = false;
        for (int j = 0; j < index; j++) {
            if (arr[index] == arr[j]) {
                found = true;
                break;
            }
        }
        if (found) {
            UsingRecursionFindElementWithMinimumFrequencyMethods(arr, index + 1, minimumelement, minimumcountvalue);
            return;
        }

        int count = 1;
        for (int k = index + 1; k < arr.length; k++) {
            if (arr[k] == arr[index]) {
                count++;
            }
        }

        if (count < minimumcountvalue) {
            minimumelement = arr[index];
        }

        UsingRecursionFindElementWithMinimumFrequencyMethods(arr, index + 1, minimumelement, minimumcountvalue);
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

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindElementWithMinimumFrequency
                .UsingRecursionFindElementWithMinimumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 }, 0, 0,
                        Integer.MAX_VALUE);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
