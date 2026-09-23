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
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
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

        int newarr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            newarr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(newarr));
    }
}

class UsingRecursionCopyOneArraytoAnother {
    public static void UsingRecursionCopyOneArraytoAnotherMethods(int arr[], int newarr[], int index) {

        if (index == arr.length) {
            System.out.println(Arrays.toString(newarr));
            return;
        }
        newarr[index] = arr[index];
        UsingRecursionCopyOneArraytoAnotherMethods(arr, newarr, index + 1);
    }
}

class UsingArraysCopy_CopyOneArraytoAnother {
    public static void UsingArraysCopy_CopyOneArraytoAnotherMethods(int arr[]) {

        int newarr[] = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newarr));
    }
}

public class CopyOneArraytoAnother {
    public static void main(String[] args) {
        UsingNestedForLoopCopyOneArraytoAnother
                .UsingNestedForLoopCopyOneArraytoAnotherMethods(new int[] { 10, 20, 30, 40
                });
        UsingArrayListCopyOneArraytoAnother
        .UsingArrayListCopyOneArraytoAnotherMethods(new int[] { 10, 50, 20, 30, 40
        });
        int arr[] = new int[] { 10, 50, 60, 20, 30, 40 };
        UsingRecursionCopyOneArraytoAnother.UsingRecursionCopyOneArraytoAnotherMethods(arr,
        new int[arr.length], 0);

        UsingArraysCopy_CopyOneArraytoAnother
        .UsingArraysCopy_CopyOneArraytoAnotherMethods(new int[] { 10, 50, 60, 20, 30
        });
    }
}
