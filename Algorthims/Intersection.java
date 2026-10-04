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

            for (int k = 0; k < arr2.length; k++) {
                if (arr2[k] == arr1[i]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }

    }
}
