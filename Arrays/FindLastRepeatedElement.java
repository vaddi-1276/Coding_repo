package Arrays;

import java.util.ArrayList;

// Input:
// [10, 20, 30, 20, 40, 10]

// Output:
// 10

class UsingNestedForLoopFindLastRepeatedElement {
    public static void UsingNestedForLoopFindLastRepeatedElementMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}

class UsingArrayListFindLastRepeatedElement {
    public static void UsingArrayListFindLastRepeatedElementMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j >= i; j--) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}

public class FindLastRepeatedElement {
    public static void main(String[] args) {
        UsingNestedForLoopFindLastRepeatedElement
                .UsingNestedForLoopFindLastRepeatedElementMethods(new int[] { 10, 20, 30, 20, 40, 10 });
        UsingArrayListFindLastRepeatedElement
                .UsingArrayListFindLastRepeatedElementMethods(new int[] { 10, 20, 30, 20, 40, 10 });
    }
}
