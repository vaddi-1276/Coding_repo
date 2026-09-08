package Arrays;

import java.util.ArrayList;

// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [3, 4, 5, 6]

// Output:
// [3, 4]

class UsingNestedForLoopFindIntersectionofTwoArrays {
    public static void UsingNestedForLoopFindIntersectionofTwoArraysMethods(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

class UsingArrayListFindIntersectionofTwoArrays {
    public static void UsingArrayListFindIntersectionofTwoArraysMethods(int arr1[], int arr2[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {

                if (list1.get(i) == list2.get(j)) {
                    System.out.println(list1.get(i));
                    break;
                }
            }
        }
    }
}

class UsingRecursionFindIntersectionofTwoArrays {

    public static void UsingRecursionFindIntersectionofTwoArraysMethods(
            int arr1[], int arr2[], int index1, int index2) {

        if (index1 == arr1.length) {
            return;
        }

        if (index2 == arr2.length) {
            UsingRecursionFindIntersectionofTwoArraysMethods(
                    arr1, arr2, index1 + 1, 0);
            return;
        }

        if (arr1[index1] == arr2[index2]) {
            System.out.print(arr1[index1] + " ");
            UsingRecursionFindIntersectionofTwoArraysMethods(
                    arr1, arr2, index1 + 1, 0);
            return;
        }

        UsingRecursionFindIntersectionofTwoArraysMethods(
                arr1, arr2, index1, index2 + 1);
    }
}

public class FindIntersectionofTwoArrays {
    public static void main(String[] args) {
        UsingNestedForLoopFindIntersectionofTwoArrays.UsingNestedForLoopFindIntersectionofTwoArraysMethods(
                new int[] { 1, 2, 3, 4 }, new int[] { 3, 4, 5, 6 });
        UsingArrayListFindIntersectionofTwoArrays
                .UsingArrayListFindIntersectionofTwoArraysMethods(new int[] { 1, 2, 7, 8 }, new int[] { 5, 6, 7, 8 });
        UsingRecursionFindIntersectionofTwoArrays.UsingRecursionFindIntersectionofTwoArraysMethods(
                new int[] { 1, 2, 7, 8 }, new int[] { 5, 6, 7, 8 }, 0, 0);
    }
}
