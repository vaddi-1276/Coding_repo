package Arrays;

// Input: [1, 5, 7, -1, 5]
// Target = 6

// Output:
// 1 + 5 = 6
// 7 + (-1) = 6
// 1 + 5 = 6

class UsingNestedForLoopFindAllPairsWithGivenSum {
    public static void UsingNestedForLoopFindAllPairsWithGivenSumMethods(int arr[], int target) {

        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found=true;
                }
            }
        }

        if(found==false)
        {
            System.out.println("Element is not Found");
        }
    }
}

class UsingRecursionFindAllPairsWithGivenSum {
    public static void UsingRecursionFindAllPairsWithGivenSumMethods(int arr[], int index, int target) {

        if (index == arr.length) {
            return;
        }

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] + arr[j] == target) {
                System.out.println(arr[index] + " + " + arr[j] + " = " + target);
            }
        }
        UsingRecursionFindAllPairsWithGivenSumMethods(arr, index + 1, target);
    }
}

public class FindAllPairsWithGivenSum {
    public static void main(String[] args) {
        UsingNestedForLoopFindAllPairsWithGivenSum
                .UsingNestedForLoopFindAllPairsWithGivenSumMethods(new int[] { 1, 5, 7, -1, 5 }, 30);
        UsingRecursionFindAllPairsWithGivenSum
                .UsingRecursionFindAllPairsWithGivenSumMethods(new int[] { 1, 5, 7, -1, 5 }, 0, 6);
    }
}
