package Arrays;

import java.util.Arrays;

// Input:
// [40, 10, 30, 20, 50]

// Output:
// [10, 20, 30, 40, 50]

class UsingArraysSort_SortArrayAscending {
    public static void UsingArraysSort_SortArrayAscendingMethods(int arr[]) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class UsingNestedForLoopSortArrayAscending {
    public static void UsingNestedForLoopSortArrayAscendingMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class UsingRecursionSortArrayAscending
{
    public static void UsingRecursionSortArrayAscendingMethods(int arr[],int index) {
       
        if(index==arr.length-1)
        {
            return;
        }

        for(int j=index+1;j<arr.length;j++)
        {
            if(arr[index]>arr[j])
            {
                int temp=arr[index];
                arr[index]=arr[j];
                arr[j]=temp;
            }
        }
        UsingRecursionSortArrayAscendingMethods(arr, index + 1);
    }
}
public class SortArrayAscending {
    public static void main(String[] args) {
        UsingArraysSort_SortArrayAscending.UsingArraysSort_SortArrayAscendingMethods(new int[] { 40, 10, 30, 20, 50 });
        UsingNestedForLoopSortArrayAscending
                .UsingNestedForLoopSortArrayAscendingMethods(new int[] { 40, 10, 30, 20, 50, 60 });
        int[] arr = { 40, 10, 30, 20, 50 };
        UsingRecursionSortArrayAscending.UsingRecursionSortArrayAscendingMethods(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
