package Algorthims;

// [16,17,4,3,5,2]
// 17 5 2

public class Leaders {
    public static void LeadersMethods(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        LeadersMethods(new int[] { 16, 17, 4, 3, 5, 2 });
    }
}
