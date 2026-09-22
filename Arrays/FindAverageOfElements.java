package Arrays;

import java.util.ArrayList;

// Input:
// [10, 20, 30, 40, 50]

// Output:
// 30

class UsingForLoopFindAverageOfElements {
    public static void UsingForLoopFindAverageOfElementsMethods(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        System.out.println(average);
    }
}

class UsingArrayListFindAverageOfElements {
    public static void UsingArrayListFindAverageOfElementsMethods(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        int average = sum / list.size();
        System.out.println(average);
    }
}

class UsingSumOfArrayValuesFindAverageOfElements {
    public static void UsingSumOfArrayValuesFindAverageOfElementsMethods(int arr[], int index, int sum) {

        if (index == arr.length) {
            System.out.println(sum);
            int average = sum / arr.length;
            System.out.println(average);
            return;
        }

        sum = sum + arr[index];
        UsingSumOfArrayValuesFindAverageOfElementsMethods(arr, index + 1, sum);
    }
}

public class FindAverageOfElements {
    public static void main(String[] args) {
        UsingForLoopFindAverageOfElements.UsingForLoopFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50 });

        UsingArrayListFindAverageOfElements
                .UsingArrayListFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50, 60 });

        UsingSumOfArrayValuesFindAverageOfElements
                .UsingSumOfArrayValuesFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50, 60 }, 0, 0);
    }
}
