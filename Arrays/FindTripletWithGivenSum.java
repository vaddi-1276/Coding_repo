package Arrays;

// Input: [1, 2, 4, 5, 6]
// Target = 12

// Output:
// 1 + 5 + 6 = 12
// 2 + 4 + 6 = 12

class UsingNestedForLoopFindTripletWithGivenSum {
    public static void UsingNestedForLoopFindTripletWithGivenSumMethods(int arr[], int target) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + target);
                        found = true;
                    }
                }
            }
        }
        if (found == false) {
            System.out.println("Element is not Found");
        }
    }
}

class UsingRecursionFindTripletWithGivenSum {

    static boolean found=false;
    public static void UsingRecursionFindTripletWithGivenSumMethods(int arr[], int index, int target) {

        if (index == arr.length) {

            if(found==false)
            {
                System.out.println("Element is not Found");
            }
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] + arr[i] + arr[j] == target) {
                    System.out.println(arr[index] + " + " + arr[i] + " + " + arr[j] + " = " + target);
                    found=true;
                }
            }
        }
        UsingRecursionFindTripletWithGivenSumMethods(arr, index + 1, target);
    }
}

public class FindTripletWithGivenSum {
    public static void main(String[] args) {
        UsingNestedForLoopFindTripletWithGivenSum
                .UsingNestedForLoopFindTripletWithGivenSumMethods(new int[] { 1, 2, 4, 5, 6 }, 12);
        UsingRecursionFindTripletWithGivenSum.UsingRecursionFindTripletWithGivenSumMethods(new int[] { 1, 2, 4, 5, 6 },
                0, 36);
    }
}
