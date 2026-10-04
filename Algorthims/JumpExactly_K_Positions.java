package Algorthims;

// [1,2,3,4,5,6], K=2

// true

public class JumpExactly_K_Positions {
    public static boolean JumpExactly_K_PositionsMethods(int arr[], int value) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + value; j < arr.length; j = j + value) {
                if (j == arr.length - 1) {
                    found = true;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        System.out.println(JumpExactly_K_PositionsMethods(new int[] { 1, 2, 3, 4, 5, 6 }, 3));
    }
}
