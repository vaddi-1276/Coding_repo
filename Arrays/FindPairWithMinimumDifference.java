package Arrays;

// Input: [10, 3, 8, 15, 12]
// Output:
// 10, 12

class UsingNestedForLoopFindPairWithMinimumDifference {
    public static void UsingNestedForLoopFindPairWithMinimumDifferenceMethods(int arr[]) {

        int mindifference = Integer.MIN_VALUE;
        int firstelement = arr[0];
        int secondelement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int difference = Math.abs(arr[j] - arr[i]);

                if (difference > mindifference) {
                    mindifference = difference;
                    firstelement = arr[i];
                    secondelement = arr[j];

                }
            }
        }
        System.out.println(firstelement);
        System.out.println(secondelement);
    }
}

public class FindPairWithMinimumDifference {
    public static void main(String[] args) {
        UsingNestedForLoopFindPairWithMinimumDifference
                .UsingNestedForLoopFindPairWithMinimumDifferenceMethods(new int[] { 10, 3, 8, 15, 12 });
    }
}
