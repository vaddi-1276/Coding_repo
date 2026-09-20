package Arrays;

// Input: [9, 6, 3, 5, 7, 2]

// Output: 3, 2

class UsingNestedForLoopFindLocalMinima {
    public static void UsingNestedForLoopFindLocalMinimaMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] < arr[i + 1]) {
                    System.out.print(arr[i]);
                }
            }

            else if (i == arr.length - 1) {
                if (arr[i] < arr[i - 1]) {
                    System.out.print(arr[i]);
                }
            }

            else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();

    }
}

class UsingRecursionFindLocalMinima {
    public static void UsingRecursionFindLocalMinimaMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }
        if (index == 0) {
            if (arr[index] < arr[index + 1]) {
                System.out.print(arr[index]);
            }
        }

        else if (index == arr.length - 1) {

            if (arr[index] < arr[index - 1]) {
                System.out.print(arr[index]);
            }
        }

        else if (arr[index] < arr[index - 1] && arr[index] < arr[index + 1]) {
            System.out.print(arr[index] + ",");
        }
        UsingRecursionFindLocalMinimaMethods(arr, index + 1);
    }
}

public class FindLocalMinima {
    public static void main(String[] args) {
        UsingNestedForLoopFindLocalMinima.UsingNestedForLoopFindLocalMinimaMethods(new int[] { 9, 6, 3, 5, 7, 2 });
        UsingRecursionFindLocalMinima.UsingRecursionFindLocalMinimaMethods(new int[] { 9, 6, 3, 5, 7, 2 }, 0);
        System.out.println();
    }
}
