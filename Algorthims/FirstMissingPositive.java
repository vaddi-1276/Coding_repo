package Algorthims;

// [3,4,-1,1]

// 2

public class FirstMissingPositive {
    public static int FirstMissingPositiveMethods(int arr[]) {

        for (int i = 1; i < arr.length + 1; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstMissingPositiveMethods(new int[] { 3, 4, -1, 1 });
    }
}
