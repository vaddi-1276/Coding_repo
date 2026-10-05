package Algorthims;

// [3,2,1,0,4]

// true

public class Forward_Jump {

    public static boolean Forward_JumpMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1;j<=i+arr[i] && j < arr.length; j++) {

                if(j==arr.length-1)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Forward_JumpMethods(new int[] { 3, 2, 1, 0, 4 }));
    }
}
