package Algorthims;

// [1,2,2,1], [2,2]

// [2]

public class Intersection {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 2, 1 };
        int arr2[] = { 2, 2 };

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            for (int l = 0; l < arr2.length; l++) {
                if (arr2[l] == arr1[i]) {
                    System.out.println(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
