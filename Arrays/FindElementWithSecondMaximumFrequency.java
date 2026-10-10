package Arrays;

// Input:

// [10, 20, 10, 30, 20, 10]

// Output:
// 20

class UsingNestedForLoopFindElementWithSecondMaximumFrequency {
    public static void UsingNestedForLoopFindElementWithSecondMaximumFrequencyMethods(int arr[]) {

        int firstmaximumcount = Integer.MIN_VALUE;
        int secondmaximumcount = Integer.MIN_VALUE;
        int firstelement = 0;
        int secondelement = 0;
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

            if (count > firstmaximumcount) {
                secondmaximumcount = firstmaximumcount;
                firstmaximumcount = count;
                firstelement = arr[i];
            }

            else if (count > secondmaximumcount && firstmaximumcount != count) {
                secondmaximumcount = count;
                secondelement = arr[i];
            }
        }

        System.out.println("First maximum Frequency Element = " + firstelement);
        System.out.println("Second maximum Frequency Element = " + secondelement);
    }
}

class UsingRecursionFindElementWithSecondMaximumFrequency {
    public static void UsingRecursionFindElementWithSecondMaximumFrequencyMethods(int arr[], int index,
            int firstmaximumcount, int secondmaximumcount, int firstelement, int secondelement) {

        if (index == arr.length) {
            System.out.println(firstelement);
            System.out.println(secondelement);
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
            UsingRecursionFindElementWithSecondMaximumFrequencyMethods(arr, index + 1, firstmaximumcount,
                    secondmaximumcount, firstelement, secondelement);
            return;
        }

        int count = 1;
        for (int k = index + 1; k < arr.length; k++) {
            if (arr[k] == arr[index]) {
                count++;
            }
        }

        if (count > firstmaximumcount) {
            secondmaximumcount = firstmaximumcount;
            firstmaximumcount = count;
            firstelement = arr[index];
        }

        else if (count > secondmaximumcount && firstmaximumcount != count) {
            secondmaximumcount = count;
            secondelement = arr[index];
        }

        UsingRecursionFindElementWithSecondMaximumFrequencyMethods(arr, index + 1, firstmaximumcount,
                secondmaximumcount, firstelement, secondelement);
    }
}

class UsingForLoopFindElementWithSecondMaximumFrequency {
    public static void UsingForLoopFindElementWithSecondMaximumFrequencyMethods(int arr[]) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int firstelement = arr[0];
        int secondelement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > firstMax) {
                secondMax = firstMax;
                firstMax = count;
                firstelement = arr[i];
            }

            else if (count > secondMax && firstMax != count) {
                secondMax = count;
                secondelement = arr[i];
            }
        }
        System.out.println("First Max Count = " + firstMax);
        System.out.println("First Max Element = " + firstelement);

        System.out.println("Second Max Count = " + secondMax);
        System.out.println("Second Max Element = " + secondelement);
    }
}

public class FindElementWithSecondMaximumFrequency {
    public static void main(String[] args) {

        UsingNestedForLoopFindElementWithSecondMaximumFrequency
                .UsingNestedForLoopFindElementWithSecondMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindElementWithSecondMaximumFrequency
                .UsingRecursionFindElementWithSecondMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 }, 0,
                        Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingForLoopFindElementWithSecondMaximumFrequency
        // .UsingForLoopFindElementWithSecondMaximumFrequencyMethods(new int[] { 10, 20,
        // 10, 30, 20, 10 });

        // System.out.println(
        // "----------------------------------------------------------------------------------------------");
    }
}
