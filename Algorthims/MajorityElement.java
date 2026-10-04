package Algorthims;

// [2,2,1,1,1,2,2]

// 2

public class MajorityElement {
    public static int MajorityElementMethods(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }
            int count = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(MajorityElementMethods(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }
}
