package Arrays;

import java.util.ArrayList;

// Input:
// [1, 2, 3, 4, 5, 6, 7]

// Output:
// Even = 3
// Odd = 4

class UsingForLoopCountEvenandOddNumbers {
    public static void UsingForLoopCountEvenandOddNumbersMethods(int arr[]) {

        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}

class UsingArrayListCountEvenandOddNumbers {
    public static void UsingArrayListCountEvenandOddNumbersMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evencount++;
            }

            else {
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}

class UsingRecursionCountEvenandOddNumbers {
    public static void UsingRecursionCountEvenandOddNumbersMethods(int arr[], int recursionevencount,
            int recursionoddcount, int index) {

        if (index == arr.length) {
            System.out.println(recursionevencount);
            System.out.println(recursionoddcount);
            return;
        }

        if (arr[index] % 2 == 0) {
            recursionevencount++;
        }

        else {
            recursionoddcount++;
        }

        UsingRecursionCountEvenandOddNumbersMethods(arr, recursionevencount, recursionoddcount, index + 1);
    }
}

public class CountEvenandOddNumbers {
    public static void main(String[] args) {
        UsingForLoopCountEvenandOddNumbers.UsingForLoopCountEvenandOddNumbersMethods(new int[] { 1, 2, 3, 4, 5, 6, 7 });
        UsingArrayListCountEvenandOddNumbers
                .UsingArrayListCountEvenandOddNumbersMethods(new int[] { 1, 2, 3, 4, 5, 6, 7,
                        8, 9, 10 });
        UsingRecursionCountEvenandOddNumbers
                .UsingRecursionCountEvenandOddNumbersMethods(new int[] { 1, 2, 3, 4, 5, 6, 7
                }, 0, 0, 0);
    }
}
