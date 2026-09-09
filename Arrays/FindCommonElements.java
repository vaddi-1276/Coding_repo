package Arrays;

import java.util.ArrayList;

// Input:
// Array 1 = [1, 2, 3, 4, 5]
// Array 2 = [3, 4, 5, 6, 7]

// Output:
// 3, 4, 5

class UsingNestedForLoopFindCommonElements {
    public static void UsingNestedForLoopFindCommonElementsMethods(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }
}

class UsingArrayListFindCommonElements {
    public static void UsingArrayListFindCommonElementsMethods(int arr1[], int arr2[]) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        for (int i = 0; i < list1.size(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (list1.get(i) == list1.get(j)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            boolean found = false;
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i) == list1.get(j)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(list2.get(i) + " ");
            }
        }
        System.out.println();
    }
}

public class FindCommonElements {
    public static void main(String[] args) {
        UsingNestedForLoopFindCommonElements.UsingNestedForLoopFindCommonElementsMethods(new int[] { 1, 2, 3, 4, 5 },
                new int[] { 3, 4, 5, 6, 7 });
        UsingArrayListFindCommonElements.UsingArrayListFindCommonElementsMethods(new int[] { 1, 2, 3, 4, 5 },
                new int[] { 3, 4, 5, 6, 7 });
    }
}
