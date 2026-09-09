package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Input:
// [1, 2, 3, 4, 5]

// Output:
// [5, 4, 3, 2, 1]

class UsingCollectionsReverse_ReverseArrayWithoutExtraArray {
    public static void UsingCollectionsReverse_ReverseArrayWithoutExtraArrayMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}

class UsingNestedForLoopReverseArrayWithoutExtraArray {
    public static void UsingNestedForLoopReverseArrayWithoutExtraArrayMethods(int arr[]) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class ReverseArrayWithoutExtraArray {
    public static void main(String[] args) {
        UsingCollectionsReverse_ReverseArrayWithoutExtraArray
                .UsingCollectionsReverse_ReverseArrayWithoutExtraArrayMethods(new int[] { 1,
                        2, 3, 4, 5 });
        UsingNestedForLoopReverseArrayWithoutExtraArray
                .UsingNestedForLoopReverseArrayWithoutExtraArrayMethods(new int[] { 1, 2, 3, 4, 5 });
    }
}
