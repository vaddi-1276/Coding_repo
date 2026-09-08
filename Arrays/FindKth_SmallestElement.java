package Arrays;

import java.util.ArrayList;

// Input:
// [10, 40, 20, 50, 30]
// K = 2

// Output:
// 20

class UsingNestedForLoopFindKth_SmallestElement {
    public static void UsingNestedForLoopFindKth_SmallestElementMethods(int arr[], int value) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int index = value - 1;
        System.out.println(arr[index]);
    }
}

class UsingArrayListFindKth_SmallestElement {
    public static void UsingArrayListFindKth_SmallestElementMethods(int arr[], int value) {

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

        int indexvalue = value - 1;
        System.out.println(list.get(indexvalue));
    }
}

class UsingArrayArrangeFindKth_SmallestElement {
    public static void UsingArrayArrangeFindKth_SmallestElementMethods(int arr[], int index) {

        if (index == arr.length - 1) {
            return;
        }

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] > arr[j]) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        UsingArrayArrangeFindKth_SmallestElementMethods(arr, index + 1);
    }
}

class UsingRecursionFindKth_SmallestElement {
    public static void UsingRecursionFindKth_SmallestElementmethods(int arr[], int value) {

        UsingArrayArrangeFindKth_SmallestElement.UsingArrayArrangeFindKth_SmallestElementMethods(arr, 0);

        int indexvalue = value - 1;
        System.out.println(arr[indexvalue]);
    }
}

public class FindKth_SmallestElement {
    public static void main(String[] args) {
        UsingNestedForLoopFindKth_SmallestElement
                .UsingNestedForLoopFindKth_SmallestElementMethods(new int[] { 10, 40, 20, 50, 30 }, 2);
        UsingArrayListFindKth_SmallestElement
                .UsingArrayListFindKth_SmallestElementMethods(new int[] { 10, 40, 20, 50, 30 }, 3);
        UsingRecursionFindKth_SmallestElement
                .UsingRecursionFindKth_SmallestElementmethods(new int[] { 10, 40, 20, 50, 30 }, 3);
    }
}
