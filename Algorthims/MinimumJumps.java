package Algorthims;

// [2,3,1,1,4]

// 2

public class MinimumJumps {
    public static int MinimumJumpsMethods(int arr[]) {
        int jumps = 0;
        int currentEnd = 0;
        int farthestEnd = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            farthestEnd = Math.max(farthestEnd, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthestEnd;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(MinimumJumpsMethods(new int[] { 2, 3, 1, 1, 4 }));
    }
}
