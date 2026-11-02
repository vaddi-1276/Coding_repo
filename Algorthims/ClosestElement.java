package Algorthims;

// [1,4,6,8,10], Target=7

// 6

public class ClosestElement {
    public static void ClosestElementMethods(int arr[]) {
        int value = -1;
        int targetvalue = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < targetvalue) {
                value = arr[i];
            } else {
                break;
            }
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        ClosestElementMethods(new int[] { 1, 4, 6, 8, 10 });
    }
}
