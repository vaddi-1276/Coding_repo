package Algorthims;

// [4,5,6,7,0,1,2]
// 4

// Visual Representation
// [4, 5, 6, 7, 0, 1, 2]
//                 ↑
//           smallest element
//           index = 4
// Key Logic
// Number of Rotations = Index of Minimum Element

// For:

// [4,5,6,7,0,1,2]
// Minimum element = 0
// Index of 0      = 4
// Final Answer
// Output = 4

public class NumberofRotations {
    public static int NumberofRotationsMethods(int arr[]) {

        int minimumindexvalue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minimumindexvalue]) {
                minimumindexvalue = i;
            }
        }

        return minimumindexvalue;
    }

    public static void main(String[] args) {
        System.out.println(NumberofRotationsMethods(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }
}
