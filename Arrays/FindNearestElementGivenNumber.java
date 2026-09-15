package Arrays;

// Input: [10, 20, 30, 40, 50]
// Target = 34

// Output: 30

class UsingNestedForLoopFindNearestElementGivenNumber {
    public static void UsingNestedForLoopFindNearestElementGivenNumberMethods(int arr[], int targetvalue) {

        int nearest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(targetvalue - arr[i]) < Math.abs(targetvalue - nearest)) {
                nearest = arr[i];
            }
        }
        System.out.println(nearest);
    }
}

class UsingRecursionFindNearestElementGivenNumber {
    public static void UsingRecursionFindNearestElementGivenNumberMethods(int arr[], int index, int targetvalue,
            int nearest) {

        if (index == arr.length) {
            System.out.println(nearest);
            return;
        }

        if (Math.abs(targetvalue - arr[index]) < Math.abs(targetvalue - nearest)) {
            nearest = arr[index];
        }
        UsingRecursionFindNearestElementGivenNumberMethods(arr, index + 1, targetvalue, nearest);
    }
}

public class FindNearestElementGivenNumber {
    public static void main(String[] args) {
        UsingNestedForLoopFindNearestElementGivenNumber
                .UsingNestedForLoopFindNearestElementGivenNumberMethods(new int[] { 10, 20, 30, 40, 50 }, 23);
        // UsingRecursionFindNearestElementGivenNumber
        // .UsingRecursionFindNearestElementGivenNumberMethods(new int[] { 10, 20, 30,
        // 40, 50 }, 0, 43,
        // Integer.MIN_VALUE);
    }
}
