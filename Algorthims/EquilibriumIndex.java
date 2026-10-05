package Algorthims;

// [-7,1,5,2,-4,3,0]

// 3
public class EquilibriumIndex {
    public static int EquilibriumIndexMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j < i; j++) {
                leftsum = leftsum + arr[j];
            }

            for (int k = i + 1; k < arr.length; k++) {
                rightsum = rightsum + arr[k];
            }

            if(leftsum==rightsum)
            {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        EquilibriumIndexMethods(new int[] { -7, 1, 5, 2, -4, 3, 0 });
    }
}
