package Arrays;

// Input: [2, 3, 5, 7, 8]
// Output:
// 7 × 8 = 56

class UsingNestedForLoopFindPairWithMaximumProduct {
    public static void UsingNestedForLoopFindPairWithMaximumProductMethods(int arr[]) {

        int maxproduct = Integer.MIN_VALUE;
        int firstelement = arr[0];
        int secondelement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];

                if (product > maxproduct) {
                    maxproduct = product;
                    firstelement = arr[i];
                    secondelement = arr[j];
                }
            }
        }

        System.out.println(firstelement + " * " + secondelement + " = " + maxproduct);
    }
}

class UsingRecursionFindPairWithMaximumProduct {
    public static void UsingRecursionFindPairWithMaximumProductMethods(int arr[], int index, int maxproduct,
            int firstelement, int secondelement) {
        if (index == arr.length) {
            System.out.println(firstelement + " * " + secondelement + " = " + maxproduct);
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            int product = arr[index] * arr[i];

            if (product > maxproduct) {
                maxproduct = product;
                firstelement = arr[index];
                secondelement = arr[i];
            }
        }
        UsingRecursionFindPairWithMaximumProductMethods(arr, index + 1, maxproduct, firstelement, secondelement);
    }
}

public class FindPairWithMaximumProduct {
    public static void main(String[] args) {
        UsingNestedForLoopFindPairWithMaximumProduct
                .UsingNestedForLoopFindPairWithMaximumProductMethods(new int[] { 2, 3, 5, 7, 8 });
        int arr[] = new int[] { 2, 3, 5, 7, 8 };
        UsingRecursionFindPairWithMaximumProduct
                .UsingRecursionFindPairWithMaximumProductMethods(arr, 0, Integer.MIN_VALUE, arr[0], arr[0]);
    }
}
