package Arrays;

// Input: [50, 40, 30, 20, 10]
// Output: Sorted in Descending Order

class UsingNestedForLoopCheckArrayIsSortedDescendingOrder {
    public static void UsingNestedForLoopCheckArrayIsSortedDescendingOrderMethods(int arr[]) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    System.out.println("Not Sorted in Descending Order");
                    found = true;
                    break;
                }
            }
        }
        if (found == false) {
            System.out.println("Sorted in Descending Order");
        }
    }
}

class UsingRecursionCheckArrayIsSortedDescendingOrder {
    static boolean found = false;

    public static void UsingRecursionCheckArrayIsSortedDescendingOrderMethods(int arr[], int index) {

        if (index == arr.length) {
            if (found == false) {
                System.out.println("Sorted in Descending Order ");
            }
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                System.out.println("Not Sorted in Descending Order ");
                return;
            } 
        }
        UsingRecursionCheckArrayIsSortedDescendingOrderMethods(arr, index + 1);
    }
}

public class CheckArrayIsSortedDescendingOrder {
    public static void main(String[] args) {
        UsingNestedForLoopCheckArrayIsSortedDescendingOrder
                .UsingNestedForLoopCheckArrayIsSortedDescendingOrderMethods(new int[] { 50, 50, 30, 20, 10 });

        UsingRecursionCheckArrayIsSortedDescendingOrder
                .UsingRecursionCheckArrayIsSortedDescendingOrderMethods(new int[] { 40, 40, 30, 20, 10 }, 0);
    }
}
