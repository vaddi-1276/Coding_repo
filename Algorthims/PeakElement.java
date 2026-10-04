package Algorthims;

// [1,3,20,4,30,1,0]

// 20

public class PeakElement {
    public static int PeakElementMethods(int arr[]) {

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(PeakElementMethods(new int[] { 1, 3, 20, 4, 30, 1, 0 }));
    }
}
