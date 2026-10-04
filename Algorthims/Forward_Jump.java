package Algorthims;

// [3,2,1,0,4]

// true

public class Forward_Jump {

    public static boolean Forward_JumpMethods(int arr[]) {

        int maxreach = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > maxreach) {
                return false;
            }

            if (i + arr[i] > maxreach) {
                maxreach = i + arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Forward_JumpMethods(new int[] { 3, 2, 1, 1, 4 }));
    }
}
