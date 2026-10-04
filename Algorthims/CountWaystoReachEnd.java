package Algorthims;

// [2,2,1,1]

// 3

public class CountWaystoReachEnd {
    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1 };
        int count[] = new int[arr.length];

        count[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= i + arr[i]; j++) {
                if (j < arr.length) {
                    count[j] = count[j] + count[i];
                }
            }
        }
        System.out.println(count[arr.length - 1]);
    }

}
