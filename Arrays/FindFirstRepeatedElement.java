package Arrays;

import java.util.ArrayList;

// Input:
// [10, 20, 30, 20, 40, 10]

// Output:
// 20

class UsingNestedForLoopFindFirstRepeatedElement {
    public static void UsingNestedForLoopFindFirstRepeatedElementMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

    }
}

class UsingArrayListFindFirstRepeatedElement {
    public static void UsingArrayListFindFirstRepeatedElementMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(list.get(i));
                    return;
                }
            }
        }
    }
}

class UsingRecursionFindFirstRepeatedElement {
    public static void UsingRecursionFindFirstRepeatedElementMethods(int arr[], int index) {
        if (index == arr.length) {
            return;
        }

        for (int j = 0; j < index; j++) {
            if (arr[index] == arr[j]) {
                System.out.println(arr[index]);
                return;
            }
        }
        UsingRecursionFindFirstRepeatedElementMethods(arr, index + 1);
    }
}

public class FindFirstRepeatedElement {
    public static void main(String[] args) {
        UsingNestedForLoopFindFirstRepeatedElement
                .UsingNestedForLoopFindFirstRepeatedElementMethods(new int[] { 10, 20, 30, 20, 40, 10 });
        UsingArrayListFindFirstRepeatedElement
                .UsingArrayListFindFirstRepeatedElementMethods(new int[] { 10, 20, 30, 20, 40, 10 });
        UsingRecursionFindFirstRepeatedElement
                .UsingRecursionFindFirstRepeatedElementMethods(new int[] { 10, 20, 30, 20, 40, 10 }, 0);
    }
}
