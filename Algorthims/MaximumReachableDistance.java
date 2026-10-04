package Algorthims;

// [2,3,1,1,4]

// 4

public class MaximumReachableDistance {
    public static int MaximumReachableDistanceMethods(int arr[]) {

        int maxReach = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int currentreach = i + arr[i];

            if (currentreach > maxReach) {
                maxReach = currentreach;
            }
        }
        return maxReach;
    }

    public static void main(String[] args) {
        System.out.println(MaximumReachableDistanceMethods(new int[] { 2, 3, 1, 1, 4 }));
    }
}
