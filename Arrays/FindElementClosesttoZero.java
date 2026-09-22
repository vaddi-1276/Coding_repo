package Arrays;

// Input: [-10, -3, 5, 8, -2]
// Output: -2

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
    public static void UsingRecursionFindElementClosesttoZeroMethods(int arr[], int index, int closest) {

        if (index == arr.length) {
            System.out.println(closest);
            return;
        }
        if (Math.abs(arr[index]) < Math.abs(closest)) {
            closest = arr[index];
        }
        UsingRecursionFindElementClosesttoZeroMethods(arr, index + 1, closest);
    }
}

public class FindElementClosesttoZero {
    public static void main(String[] args) {
        UsingnestedForLoopFindElementClosesttoZero
                .UsingnestedForLoopFindElementClosesttoZeroMethods(new int[] { -10, -3, 5, 8, -2 });

        System.out.println(
                "----------------------------------------------------------------------------------------------");

        int arr[] = new int[] { -10, -3, 5, 8, -2 };
        UsingRecursionFindElementClosesttoZero
                .UsingRecursionFindElementClosesttoZeroMethods(arr, 0, arr[0]);
    }
}
