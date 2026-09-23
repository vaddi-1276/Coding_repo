package Arrays;

import java.util.ArrayList;

// Input:
// [10, 40, 20, 50, 30]
// K = 2

// Output:
// 40

class UsingNestedForLoopFind_Kth_LargestElement {
    public static void UsingNestedForLoopFind_Kth_LargestElementMethods(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int position = arr.length - value;
        System.out.println(arr[position]);
    }
}

class UsingArrayListFind_Kth_LargestElement {
    public static void UsingArrayListFind_Kth_LargestElementMethods(int arr[], int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        int indexvalue = list.size() - value;
        System.out.println(list.get(indexvalue));
    }
}

class UsingSortArrayFind_Kth_LargestElement {
    public static void UsingSortArrayFind_Kth_LargestElementMethods(int arr[], int index) {

        if (index == arr.length) {
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        UsingSortArrayFind_Kth_LargestElementMethods(arr, index + 1);
    }
}

class UsingrecursionFind_Kth_LargestElement {
    public static void UsingrecursionFind_Kth_LargestElementMethods(int arr[], int value) {

        UsingSortArrayFind_Kth_LargestElement.UsingSortArrayFind_Kth_LargestElementMethods(arr, 0);

        int result = arr[arr.length - value];
        System.out.println(result);
    }
}

public class Find_Kth_LargestElement {
    public static void main(String[] args) {
        UsingNestedForLoopFind_Kth_LargestElement
                .UsingNestedForLoopFind_Kth_LargestElementMethods(new int[] { 10, 40, 20, 50, 30 }, 2);
        UsingArrayListFind_Kth_LargestElement
                .UsingArrayListFind_Kth_LargestElementMethods(new int[] { 10, 40, 20, 50, 30
                }, 3);
        UsingrecursionFind_Kth_LargestElement
                .UsingrecursionFind_Kth_LargestElementMethods(new int[] { 10, 40, 20, 50, 30
                }, 4);
    }
}
