package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Input:
// [10, 20, 30, 40]

// Output:
// [10, 20, 30, 40]

class UsingNestedForLoopCopyOneArraytoAnother {
    public static void UsingNestedForLoopCopyOneArraytoAnotherMethods(int arr[]) {

        int newarr[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            newarr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingArrayListCopyOneArraytoAnother {
    public static void UsingArrayListCopyOneArraytoAnotherMethods(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int newarr[] = new int[list.size()];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            newarr[index++] = list.get(i);
        }
        System.out.println(Arrays.toString(newarr));
    }
}

public class CopyOneArraytoAnother {
    public static void main(String[] args) {
        UsingNestedForLoopCopyOneArraytoAnother
                .UsingNestedForLoopCopyOneArraytoAnotherMethods(new int[] { 10, 20, 30, 40 });
        UsingArrayListCopyOneArraytoAnother
                .UsingArrayListCopyOneArraytoAnotherMethods(new int[] { 10, 50, 20, 30, 40 });
    }
}
