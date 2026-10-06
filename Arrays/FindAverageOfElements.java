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
        System.out.println("Sum of Array Values : " + sum);
        int average = sum / arr.length;
        System.out.println("Average of sum of Array Values : " + average);
    }
}

class UsingRecursionFindAverageOfElements {
    public static void UsingRecursionFindAverageOfElementsMethods(int arr[], int index, int sum) {
        if (index == arr.length) {
            System.out.println("Sum of Arrays using Recursion " + sum);
            int average = sum / arr.length;
            System.out.println("Average of Sum of Array using Recursion " + average);
            return;
        }
        sum = sum + arr[index];
        UsingRecursionFindAverageOfElementsMethods(arr, index + 1, sum);
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

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        UsingRecursionFindAverageOfElements.UsingRecursionFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50 },
                0, 0);

        System.out.print(
                "--------------------------------------------------------------------------------------------------------------");

        System.out.println();

        // UsingArrayListFindAverageOfElements
        // .UsingArrayListFindAverageOfElementsMethods(new int[] { 10, 20, 30, 40, 50,
        // 60 });

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();

        // UsingSumOfArrayValuesFindAverageOfElements
        // .UsingSumOfArrayValuesFindAverageOfElementsMethods(new int[] { 10, 20, 30,
        // 40, 50, 60 }, 0, 0);

        // System.out.print(
        // "--------------------------------------------------------------------------------------------------------------");

        // System.out.println();
    }
}
