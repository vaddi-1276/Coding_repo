package Arrays;

// Input:

// [10, 20, 10, 30, 20, 10]

// Output:
// 20

class UsingNestedForLoopFindElementWithSecondMaximumFrequency {
    public static void UsingNestedForLoopFindElementWithSecondMaximumFrequencyMethods(int arr[]) {
        int firstmaxcount = Integer.MIN_VALUE;
        int secondmaxcount = Integer.MIN_VALUE;

        int firstelement = arr[0];
        int secondelement = arr[0];

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

            if (count > firstmaxcount) {
                secondmaxcount = firstmaxcount;
                firstmaxcount = count;
                firstelement = arr[i];
            }

            else if (count > secondmaxcount && firstmaxcount != count) {
                secondmaxcount = count;
                secondelement = arr[i];
            }
        }
        System.out.println("First Max = " + firstmaxcount);
        System.out.println("First Element = " + firstelement);

        System.out.println("Second Max = " + secondmaxcount);
        System.out.println("Second Element = " + secondelement);
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

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        UsingForLoopFindElementWithSecondMaximumFrequency
                .UsingForLoopFindElementWithSecondMaximumFrequencyMethods(new int[] { 10, 20, 10, 30, 20, 10 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");
    }
}
