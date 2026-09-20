package Arrays;

// Input: [1, 3, 20, 4, 1, 0]

// Output: 20

class UsingForLoopFindPeakElement {
    public static void UsingForLoopFindPeakElementMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println(arr[i]);
                }
            }

            else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}

class UsingRecursionFindPeakElement {
    public static void UsingRecursionFindPeakElementMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        if (index == 0) {
            if (arr[index] > arr[index + 1]) {
                System.out.println(arr[index]);
            }
        }

        else if (index == arr.length - 1) {
            if (arr[index] > arr[index - 1]) {
                System.out.println(arr[index]);
            }
        }

        else if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
            System.out.println(arr[index]);
        }
        UsingRecursionFindPeakElementMethods(arr, index + 1);
    }
}

public class FindPeakElement {
    public static void main(String[] args) {
        UsingForLoopFindPeakElement.UsingForLoopFindPeakElementMethods(new int[] { 1, 3, 20, 4, 1, 0 });
        UsingRecursionFindPeakElement.UsingRecursionFindPeakElementMethods(new int[] { 1, 3, 20, 4, 1, 0 }, 0);
    }
}
