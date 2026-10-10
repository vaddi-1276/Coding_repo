package Arrays;

// Input: [-7, 1, 5, 2, -4, 3, 0]
// Output: 3

class UsingNestedForLoopFindEquilibriumIndex {
    public static void UsingNestedForLoopFindEquilibriumIndexMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j < i; j++) {
                leftsum = leftsum + arr[j];
            }

            for (int j = i + 1; j < arr.length; j++) {
                rightsum = rightsum + arr[j];
            }

            if (leftsum == rightsum) {
                System.out.println(i);
                break;
            }
        }
    }
}

class UsingRecursionFindEquilibriumIndex {
    public static void UsingRecursionFindEquilibriumIndexMethods(int arr[], int index) {
        if (index == arr.length) {
            return;
        }

        int leftsum = 0;
        int rightsum = 0;

        for (int j = 0; j < index; j++) {
            leftsum = leftsum + arr[j];
        }

        for (int j = index + 1; j < arr.length; j++) {
            rightsum = rightsum + arr[j];
        }

        if (leftsum == rightsum) {
            System.out.println(index);
            return;
        }
        UsingRecursionFindEquilibriumIndexMethods(arr, index + 1);
    }
}

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        UsingNestedForLoopFindEquilibriumIndex
                .UsingNestedForLoopFindEquilibriumIndexMethods(new int[] { -7, 1, 5, 2, -4, 3, 0 });

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindEquilibriumIndex
                .UsingRecursionFindEquilibriumIndexMethods(new int[] { -7, 1, 5, 2, -4, 3, 0 }, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();
    }
}
