package Arrays;

// Input: [-10, -3, 5, 8, -2]

// Output: -2

class UsingClosestElement {
    public static int UsingClosestElementMethods(int arr[]) {

        int value = -1;
        int target = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                value = arr[i];
            }
        }
        return value;
    }
}

class UsingnestedForLoopFindElementClosesttoZero {

    public static void UsingnestedForLoopFindElementClosesttoZeroMethods(int arr[]) {
        int closest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) < Math.abs(closest)) {
                closest = arr[i];
            }
        }
        System.out.println(closest);
    }
}

class UsingRecursionFindElementClosesttoZero {
    public static void UsingRecursionFindElementClosesttoZeroMethods(int arr[], int index, int closest, int target) {

        if (index == arr.length) {
            System.out.println(closest);
            return;
        }

        if (arr[index] <= target) {
            closest = arr[index];
        }

        UsingRecursionFindElementClosesttoZeroMethods(arr, index + 1, closest, target);
    }
}

public class FindElementClosesttoZero {
    public static void main(String[] args) {

        System.out.println(UsingClosestElement.UsingClosestElementMethods(new int[] { -10, -3, 5, 8, -2 }));

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingnestedForLoopFindElementClosesttoZero
        // .UsingnestedForLoopFindElementClosesttoZeroMethods(new int[] { -10, -3, 5, 8,
        // -2 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        int arr[] = new int[] { -10, -3, 5, 8, -2 };
        UsingRecursionFindElementClosesttoZero
                .UsingRecursionFindElementClosesttoZeroMethods(arr, 0, 0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
