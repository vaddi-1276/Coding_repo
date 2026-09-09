package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// Array 1 = [1, 3, 5]
// Array 2 = [2, 4, 6]

// Output:
// [1, 2, 3, 4, 5, 6]

class UsingNestedForLoopMergeTwoSortedArrays {
    public static void UsingNestedForLoopMergeTwoSortedArraysMethods(int arr1[], int arr2[]) {

        int newarr[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newarr[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newarr[index++] = arr2[i];
        }
        Arrays.sort(newarr);
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListMergeTwoSortedArrays {
    public static void UsingArrayListMergeTwoSortedArraysMethods(int arr1[], int arr2[]) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        int newarr[] = new int[list1.size() + list2.size()];
        int index = 0;
        for (int i = 0; i < list1.size(); i++) {
            newarr[index++] = list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            newarr[index++] = list2.get(i);
        }
        Arrays.sort(newarr);
        System.out.println(Arrays.toString(newarr));
    }
}

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        UsingNestedForLoopMergeTwoSortedArrays.UsingNestedForLoopMergeTwoSortedArraysMethods(new int[] { 1, 3, 5 },
                new int[] { 2, 4, 6 });
        UsingArrayListMergeTwoSortedArrays.UsingArrayListMergeTwoSortedArraysMethods(new int[] { 1, 3, 5, 7, 8 },
                new int[] { 2, 4, 6 });
    }
}
